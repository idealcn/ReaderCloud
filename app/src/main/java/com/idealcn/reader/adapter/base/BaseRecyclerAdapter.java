package com.idealcn.reader.adapter.base;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;


/**
 * Created by ideal on 17-6-14.
 */

public abstract class BaseRecyclerAdapter<T extends BaseViewHolder> extends RecyclerView.Adapter<BaseViewHolder> {


    @Override
    public T onCreateViewHolder(ViewGroup viewGroup, int i) {

        return makeViewHolder(viewGroup,i);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
            T holder = (T) baseViewHolder;
            bindViewHolder(holder,i);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public abstract void bindViewHolder(T holder,int position);

    public abstract T makeViewHolder(ViewGroup parent,int position);
}
