package com.idealcn.reader.ui;

import android.databinding.DataBindingUtil;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.idealcn.reader.R;
import com.idealcn.reader.User;
import com.idealcn.reader.adapter.home.HomeAdapter;
import com.idealcn.reader.binding.ActivityHomeBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ideal on 17-6-14.
 */

public class HomeActivity  extends BaseActivity {

    private ActivityHomeBinding homeBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding = (ActivityHomeBinding) binding;

        homeBinding.homeListview.setLayoutManager(new LinearLayoutManager(this){
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(
                        RecyclerView.LayoutParams.MATCH_PARENT,
                        120
                );
                return layoutParams;
            }
        });
        homeBinding.homeListview.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL){
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top = 5;
            }
        });

        List<User> list = new ArrayList<>();
        for (int x = 0; x < 10; x++) {
            User user = new User("user---"+x);
            user.phone = "10001---"+x;
            list.add(user);
        }

        HomeAdapter homeAdapter = new HomeAdapter(this,list);

        homeBinding.homeListview.setAdapter(homeAdapter);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }


}
