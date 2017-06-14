package com.idealcn.reader.ui;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * Created by ideal-gn on 2017/6/15.
 * 基类
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected  ViewDataBinding  binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,getLayout());

    }

    protected abstract int getLayout();
}
