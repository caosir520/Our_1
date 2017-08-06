package com.caosir.our;

/**
 * 创建人: caosir
 * 创建时间：2017/8/1
 * 修改人：
 * 修改时间：
 * 类说明：MVP模式基础的View接口和Persenter 绑定的接口
 */

public interface BaseView<T> {
    void setPresenter (T persenter);
}
