package com.dsh.latte.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.dsh.latte.app.Latte;

/**
 * Created by Adam on 2018/3/19.
 */

public class DimenUtil {

    public static int getScreenWidth(){
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight(){
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }

}
