package com.caosir.our.ui.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.caosir.our.BasePersenter;
import com.caosir.our.R;
import com.caosir.our.adapter.recycleadapter.MyRoadAdapter;
import com.caosir.our.bean.MyRoadItemBean;
import com.caosir.our.myroad.MyRoadContract;
import com.caosir.our.myroad.MyRoadPresenter;
import com.caosir.our.util.LogUnit;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 创建人: caosir
 * 创建时间：2017/8/1
 * 修改人：
 * 修改时间：
 * 类说明：我的奖惩的activity
 */

public class MyRoadActivity extends baseActivity implements MyRoadContract.view{
    @Bind(R.id.re_myroad)
    RecyclerView recyclerView;

    @Bind(R.id.coll_myroad)
    CollapsingToolbarLayout collapsingToolbarLayout;

    private MyRoadContract.Presenter presenter;



    @Override
    void initView(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_myroad);
        ButterKnife.bind(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        collapsingToolbarLayout.setTitle("我的成长路程");
        MyRoadContract.Presenter presenter = new MyRoadPresenter(this);
        presenter = new MyRoadPresenter(this);  //View和present进行绑定
        presenter.start();
        setTop(true);



    }

    @Override
    void setLinstener() {
        findViewById(R.id.iv_myroad_back).setOnClickListener(v->{finish();});
    }


    @Override
    public void setPresenter(MyRoadContract.Presenter persenter) {

    }


    @Override
    public void showMyRoad(List<MyRoadItemBean> list) {
        LogUnit.d("myRoad","====showMyRoad");
        MyRoadAdapter myRoadAdapter = new MyRoadAdapter(list,this);
        recyclerView.setAdapter(myRoadAdapter);
    }
}
