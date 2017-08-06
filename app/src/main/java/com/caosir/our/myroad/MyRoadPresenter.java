package com.caosir.our.myroad;

import com.caosir.our.BaseModel;
import com.caosir.our.model.MyRoadModel;

/**
 * 创建人: caosir
 * 创建时间：2017/8/1
 * 修改人：
 * 修改时间：
 * 类说明：
 */

public class MyRoadPresenter implements MyRoadContract.Presenter {

    private final MyRoadContract.view myRoadView;
    private BaseModel model;

    public MyRoadPresenter(MyRoadContract.view myRoadView) {
        this.myRoadView = myRoadView;
        model = new MyRoadModel();
    }


    @Override
    public void start() {
        getMyRoad();
    }


    //获取数据
    @Override
    public void getMyRoad() {
       myRoadView.showMyRoad(model.getDate());
    }
}
