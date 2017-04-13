package com.baiyigame.pay;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/2/14.
 */

public class PayApplication extends Application {

    private static Context mContext = null;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getAppContext()
    {
       return mContext;
    }
}
