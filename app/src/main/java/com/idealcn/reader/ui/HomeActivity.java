package com.idealcn.reader.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.idealcn.reader.R;
import com.idealcn.reader.databinding.ActivityHomeBinding;

/**
 * Created by ideal on 17-6-14.
 */

public class HomeActivity  extends BaseActivity {

    private ActivityHomeBinding homeBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding = (ActivityHomeBinding) binding;

        homeBinding.mainNavView.inflateHeaderView(R.layout.layout_main_nav_view);
//        homeBinding.mainNavView.setOnClickView((view) -> System.out.println("hello"));

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }


}
