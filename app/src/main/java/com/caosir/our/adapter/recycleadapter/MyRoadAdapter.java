package com.caosir.our.adapter.recycleadapter;

import android.content.Context;
import android.support.v7.util.AsyncListUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.caosir.our.R;
import com.caosir.our.bean.MyRoadItemBean;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 创建人: caosir
 * 创建时间：2017/8/2
 * 修改人：
 * 修改时间：
 * 类说明：
 */

public class MyRoadAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public final List<MyRoadItemBean> mData ;
    public final Context mContext;
    public final LayoutInflater layoutInflater;

    public MyRoadAdapter(List<MyRoadItemBean> mData, Context mContext ) {
        this.mData = mData;
        this.mContext = mContext;
        this.layoutInflater = LayoutInflater.from(mContext);
    }

    //获取紫布局的类型
    @Override
    public int getItemViewType(int position) {

        return mData.get(position).getType();
    }

    //绑定布局
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==MyRoadItemBean.TYPE_TIME){
            return new TimeViewHolder(layoutInflater.inflate(R.layout.item_myroad_tow,null));
        }else{
            return new MyRoadViewHolder(layoutInflater.inflate(R.layout.item_myroad_one,null));
        }
    }

    //绑定数据
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            //奖励列表数据绑定
            case MyRoadItemBean.TYPE_MYROAD:
                MyRoadViewHolder  myRoadViewHolder= (MyRoadViewHolder)holder;
                myRoadViewHolder.setView(mData.get(position));
                break;
            case MyRoadItemBean.TYPE_TIME:
                //时间分隔数据绑定
                TimeViewHolder timeViewHolder = (TimeViewHolder)holder;
                timeViewHolder.setTextView(mData.get(position).getTime());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    //时间的Item布局
    class TimeViewHolder extends  RecyclerView.ViewHolder{

        TextView textView;

        public TimeViewHolder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.tv_item_myroad_tow);
        }
        public void setTextView(String string){
            textView.setText(string);
        }
    }

    //奖励的item布局
    class MyRoadViewHolder extends RecyclerView.ViewHolder{

        ImageView im_ic;
        ImageView im_myRoad;
        TextView title1;
        TextView title2 ;


        public MyRoadViewHolder(View itemView) {
            super(itemView);
            im_ic = (ImageView)itemView.findViewById(R.id.im_myroad_time_ic);
            im_myRoad = (ImageView)itemView.findViewById(R.id.im_myroad_jiangzhang);
            title1 = (TextView) itemView.findViewById(R.id.tv_myroad_what);
            title2 = (TextView)itemView.findViewById(R.id.tv_myroad_where);
        }


        public void setView (MyRoadItemBean myRoadItemBean){
            switch (myRoadItemBean.getTypeImage()){
                case 0:
                    im_ic.setBackgroundResource(R.drawable.bg_item_myroad_one);
                    break;
                case 1:
                    im_ic.setBackgroundResource(R.drawable.bg_item_myroad_tow);
                    break;
                case 2:
                    im_ic.setBackgroundResource(R.drawable.bg_item_myroad_three);
                    break;
                case 3:
                    im_ic.setBackgroundResource(R.drawable.bg_item_myroad_four);
                    break;
                case 4:
                    im_ic.setBackgroundResource(R.drawable.bg_item_myroad_fif);
                    break;
                case 5:
                    im_ic.setBackgroundResource(R.drawable.sex);
                    break;
                case 6:
                    im_ic.setBackgroundResource(R.drawable.bg_item_myroad_sever);
                    break;
            }
            im_myRoad.setBackgroundResource(myRoadItemBean.getMyRoadImage());
            title1.setText(myRoadItemBean.getTitle1());
            title2.setText(myRoadItemBean.getTitle2());
        }


    }


}
