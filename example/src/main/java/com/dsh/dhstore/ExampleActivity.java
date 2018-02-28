package com.dsh.dhstore;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.dsh.latte.activities.ProxyActivity;
import com.dsh.latte.app.Latte;
import com.dsh.latte.delegates.LatteDelegate;

/**
 * Created by Administrator on 2018/2/28.
 */

public class ExampleActivity extends ProxyActivity{


    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
