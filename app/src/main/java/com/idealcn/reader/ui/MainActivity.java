package com.idealcn.reader.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.idealcn.reader.Presenter;
import com.idealcn.reader.R;
import com.idealcn.reader.User;
import com.idealcn.reader.binding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity {

    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = (ActivityMainBinding) binding;
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("数据绑定");
        user.isMan = false;
        user.phone = "112899222";
        mainBinding.setUser(user);
        mainBinding.setSex("男");

        List<String> stringList = new ArrayList<>();
        stringList.add("item---0");
        stringList.add("item---1");

        mainBinding.setList(stringList);
        mainBinding.setListKey(1);
        //lambda表达式
        mainBinding.setOnClick((view) ->
            startActivity(new Intent(this,HomeActivity.class))
        );

        mainBinding.setPresente(new Presenter());

        mainBinding.setError(true);

        mainBinding.temp.setText("temp");
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }
}
