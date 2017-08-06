package com.caosir.our;


import android.app.Application;
import android.content.Context;

/**
 * 创建人: caosir
 * 创建时间：2017/7/31
 * 修改人：
 * 修改时间：
 * 类说明：
 */

public class MyApplication extends Application {
    private static Context  context;

    @Override
    public void onCreate() {
        context= getApplicationContext();
    }

    public static Context getContext(){
        return  context;
    }

}
