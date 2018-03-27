package com.dsh.dhstore;

import android.app.Application;
import android.util.Log;

import com.dsh.latte.app.Latte;
import com.dsh.latte.ec.database.DatabaseManager;
import com.dsh.latte.ec.icon.FontEcModule;
import com.dsh.latte.net.interceptors.DebugInterceptor;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by Administrator on 2018/2/28.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化配置
        Latte.init(this)
                .withIcon(new FontAwesomeModule())//字体图标
                .withIcon(new FontEcModule())//自定义图标
                .withApiHost("http://192.168.1.99/")
                .withInterceptor(new DebugInterceptor("index",R.raw.test))
                .configure();
        Log.d("ExampleApp", "onCreate: ExampleApp初始化完成");
        DatabaseManager.getInstance().init(this);
    }
}
