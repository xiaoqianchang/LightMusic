package com.changxiao.lightmusic;

import android.app.Application;

/**
 * Custom application.
 * <p>
 * Created by Chang.Xiao on 2017/3/16.
 *
 * @version 1.0
 */

public class LightMusicApplication extends Application {

    private static LightMusicApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static LightMusicApplication getInstance() {
        return sInstance;
    }
}
