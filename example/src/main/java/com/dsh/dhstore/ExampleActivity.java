package com.dsh.dhstore;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.dsh.latte.activities.ProxyActivity;
import com.dsh.latte.app.Latte;
import com.dsh.latte.delegates.LatteDelegate;
import com.dsh.latte.ec.launcher.LauncherDelegate;

/**
 * Created by Administrator on 2018/2/28.
 */

public class ExampleActivity extends ProxyActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }
}
