package com.caosir.our.ui.activity;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.caosir.our.MyApplication;

import butterknife.ButterKnife;

/**
 * Created by caosir on 2017/4/3.
 */

public abstract  class baseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView(savedInstanceState);
        setLinstener();
    }

    //获取权限的操作
    public void getAccess(String type ,AcccessDo acccessDo,Activity how){
        //1.判断用户是否授权 ，
        if(ContextCompat.checkSelfPermission(MyApplication.getContext(),type)!= PackageManager.PERMISSION_GRANTED){
            //不相等说明没有获取权限 获取该权限
            ActivityCompat.requestPermissions(how,new String[]{type},1);
        }else{
            //这个说明已经获取到权限
            acccessDo.doWhat();
        }
    }

    interface AcccessDo {
        void doWhat();
    }


    abstract void initView(@Nullable Bundle savedInstanceState);
    abstract void setLinstener();

    public void setTop(boolean isShowTop){
        if(isShowTop){
            if (Build.VERSION.SDK_INT >= 21) {
                View decorView = getWindow().getDecorView();
                int option = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView.setSystemUiVisibility(option);
                getWindow().setNavigationBarColor(Color.TRANSPARENT);
                getWindow().setStatusBarColor(Color.TRANSPARENT);
            }
        }



//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();
    }

}
