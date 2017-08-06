package com.caosir.our.model;

import com.caosir.our.BaseModel;
import com.caosir.our.BasePersenter;
import com.caosir.our.R;
import com.caosir.our.bean.MyRoadItemBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人: caosir
 * 创建时间：2017/8/2
 * 修改人：
 * 修改时间：
 * 类说明：
 */

public class MyRoadModel implements BaseModel<MyRoadItemBean>{
    List<MyRoadItemBean> mDate =new ArrayList<>();

    public MyRoadModel(){
        setmDate();
    }

    @Override
    public List<MyRoadItemBean> getDate() {
        return mDate;
    }

    public void setmDate(){
        MyRoadItemBean myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);
        myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);
        myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_TIME,"2015年9月大二");
        mDate.add(myRoadItemBean);
        myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);
        myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_TIME,"2016年9月大三");
        mDate.add(myRoadItemBean);
        myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);myRoadItemBean = new MyRoadItemBean(MyRoadItemBean.TYPE_MYROAD,"软件创新大赛三等奖","江西农业大学",1, R.drawable.bg_our_bg);
        mDate.add(myRoadItemBean);




    }

}
