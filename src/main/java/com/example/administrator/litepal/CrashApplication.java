package com.example.administrator.litepal;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import org.litepal.LitePalApplication;

/**
 * Created by Administrator on 2016/5/12.
 */
public class CrashApplication extends LitePalApplication {
    private Context context;
    @Override
    public void onCreate() {
        super.onCreate();
//        context = this.context;
//        Thread.setDefaultUncaughtExceptionHandler(new  myUncaughtExceptionHandler());
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
