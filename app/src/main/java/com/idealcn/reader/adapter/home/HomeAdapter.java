package com.idealcn.reader.adapter.home;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.idealcn.reader.R;
import com.idealcn.reader.User;
import com.idealcn.reader.adapter.base.BaseRecyclerAdapter;
import com.idealcn.reader.databinding.ItemHomeBinding;

import java.util.List;


/**
 * Created by ideal on 17-6-14.
 */

public class HomeAdapter extends BaseRecyclerAdapter<HomeHolder> {

    private Context context;
    private LayoutInflater inflater;
    private List<User> userList;
    public HomeAdapter(Context context, List<User> userList){
        this.context = context;
        this.userList = userList;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public void bindViewHolder(HomeHolder holder, int position) {

        holder.bindData(userList.get(position));
        holder.binding.getRoot().setOnClickListener(v ->
            Toast.makeText(context, "position----"+position, Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public HomeHolder makeViewHolder(ViewGroup parent, int position) {

        ItemHomeBinding  itemHomeBinding = DataBindingUtil.inflate(inflater, R.layout.item_home,null,false);

        return new HomeHolder(itemHomeBinding);
    }


    @Override
    public int getItemCount() {
        return userList.size();
    }
}
