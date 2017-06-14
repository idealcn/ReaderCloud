package com.idealcn.reader.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.idealcn.reader.R;
import com.idealcn.reader.databinding.ActivitySplashBinding;
import com.idealcn.reader.listener.PerfectListener;


/**
 * Created by ideal on 17-6-14.
 */

public class SplashACtivity extends AppCompatActivity {

    private ActivitySplashBinding splashBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);

        splashBinding.setOnClick(new PerfectListener(){

            @Override
            protected void noDoubleClick(View view) {
                toMain();
            }
        });

        new Handler().postDelayed(() -> toMain(), 3500);
    }

    private void toMain() {
        startActivity(new Intent(this,HomeActivity.class));
        finish();
        overridePendingTransition(R.anim.anim_splash_screen_in,R.anim.anim_splash_screen_out);
    }


}
