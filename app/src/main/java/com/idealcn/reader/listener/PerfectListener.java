package com.idealcn.reader.listener;

import android.view.View;

/**
 * Created by ideal on 17-6-14.
 */

public abstract class PerfectListener implements View.OnClickListener {

    private long currentTime;
    private int lastViewId;


    @Override
    public void onClick(View v) {
        if (lastViewId==v.getId()) {
            if (System.currentTimeMillis() - currentTime > 1000) {
                currentTime = System.currentTimeMillis();
                noDoubleClick(v);
                lastViewId = v.getId();
                return;
            }else
                return;
        }

        noDoubleClick(v);
        lastViewId = v.getId();
    }

    public abstract void noDoubleClick(View view);
}
