package com.dsh.latte.ui;

import android.content.Context;
import android.support.v7.app.AppCompatDialog;

import com.dsh.latte.R;
import com.wang.avi.AVLoadingIndicatorView;

/**
 * Created by Adam on 2018/3/19.
 */

public class LatteLoader {

    public static void showLoading(Context context,String type){
        final AppCompatDialog dialog = new AppCompatDialog(context, R.style.dialog);

        final AVLoadingIndicatorView avLoadingIndicatorView = LoaderCreator.create(type,context);
        dialog.setContentView(avLoadingIndicatorView);



    }

}
