package com.idealcn.reader.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.idealcn.reader.R;
import com.idealcn.reader.databinding.ActivitySplashBinding;
import com.idealcn.reader.listener.PerfectListener;


/**
 * Created by ideal on 17-6-14.
 */

public class SplashACtivity extends BaseActivity {

    private ActivitySplashBinding splashBinding;
    //标记是否已经进入主界面
    private boolean isToMain;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashBinding = (ActivitySplashBinding) binding;



        splashBinding.setOnClick(new PerfectListener() {
            @Override
            public void noDoubleClick(View view) {
                toMain();
            }
        });


        new Handler().postDelayed(() -> toMain(), 3500);
    }

    @Override
    protected int getLayout() {
        return  R.layout.activity_splash;
    }

    private void toMain() {
        if (isToMain)return;
        startActivity(new Intent(this,HomeActivity.class));
        finish();
        overridePendingTransition(R.anim.anim_splash_screen_in,R.anim.anim_splash_screen_out);
        isToMain = true;
    }


}
