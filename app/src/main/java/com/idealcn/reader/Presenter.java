package com.idealcn.reader;

import android.util.Log;
import android.view.View;

/**
 * Created by ideal on 17-6-14.
 */

public class Presenter {

    private static final String TAG = Presenter.class.getSimpleName();

    public void present(View view){
        Log.d(TAG, "present: "+view.getTag());
    }

    public void setUser(View view,User user){
        Log.d(TAG, "setUser: "+user.name);
    }

}
