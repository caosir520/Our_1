package com.caosir.our.ui.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.caosir.our.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ErWeiMActivity extends baseActivity {

    @Bind(R.id.tv_erweima_name)
    TextView tv_erweima_name;

    @Bind(R.id.iv_activity_erweima)
    ImageView iv_erweima;

    @Override
    void initView(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_er_wei_m);
        ButterKnife.bind(this);
        setIvbg();
    }

    @Override
    void setLinstener() {

    }

    //设置二维码显示图片
    private void setIvbg(){
        Intent intent = getIntent();
        int i = intent.getIntExtra("what",0);
        if(i==0){
            iv_erweima.setBackgroundResource(R.drawable.wxerweima);
            tv_erweima_name.setText("微信二维码");
        }else {
            iv_erweima.setBackgroundResource(R.drawable.qqerweima);
            tv_erweima_name.setText("QQ二维码");
        }
    }
}
