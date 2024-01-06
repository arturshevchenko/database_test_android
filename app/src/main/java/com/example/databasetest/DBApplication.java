package com.example.databasetest;


import android.app.Application;

import com.appspector.sdk.AppSpector;


public class DBApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AppSpector.build(this)
                .withDefaultMonitors()
                .run("android_M2JhZWNjNjItMGM4OS00NjMwLTg3ZjAtZTFjN2RjMzg4YTJi");
    }



}
