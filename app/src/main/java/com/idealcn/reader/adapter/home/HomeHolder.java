package com.idealcn.reader.adapter.home;

import com.idealcn.reader.User;
import com.idealcn.reader.adapter.base.BaseViewHolder;
import com.idealcn.reader.databinding.ItemHomeBinding;

/**
 * Created by ideal on 17-6-14.
 */

public class HomeHolder extends BaseViewHolder {
    ItemHomeBinding binding;
    public HomeHolder(ItemHomeBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bindData(User user) {
        binding.setUser(user);
    }
}
