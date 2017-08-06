package com.caosir.our.myroad;

import com.caosir.our.BasePersenter;
import com.caosir.our.BaseView;
import com.caosir.our.bean.MyRoadItemBean;

import java.util.List;

/**
 * 创建人: caosir
 * 创建时间：2017/8/1
 * 修改人：
 * 修改时间：
 * 类说明：合同接口，方便管理好维护
 */

public interface MyRoadContract {
    interface view  extends BaseView<Presenter>{
        void showMyRoad(List<MyRoadItemBean> list);
    }
    interface  Presenter extends BasePersenter{
        void getMyRoad();
    }

}
