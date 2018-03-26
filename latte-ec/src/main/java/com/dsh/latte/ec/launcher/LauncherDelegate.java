package com.dsh.latte.ec.launcher;

import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dsh.latte.delegates.LatteDelegate;
import com.dsh.latte.ec.R;
import com.dsh.latte.ec.R2;
import com.dsh.latte.storage.LattePreference;
import com.dsh.latte.ui.launcher.ScrollLauncherTag;
import com.dsh.latte.util.timer.BaseTimerTask;
import com.dsh.latte.util.timer.ITimerListener;

import java.text.MessageFormat;
import java.util.Timer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Adam on 2018/3/26.
 */

public class LauncherDelegate extends LatteDelegate implements ITimerListener{


    @BindView(R2.id.tv_launcher_timer)
    AppCompatTextView mTvLauncherTimer;
    Unbinder unbinder;

    private Timer timer = null;
    private int mCount = 5;

    @OnClick(R2.id.tv_launcher_timer)
    void onClickTimerView(){
        if (timer!=null){
            timer.cancel();
            timer = null;
            checkIsShowScroll();
        }
    }

    private void initTimer(){
        timer = new Timer();
        final BaseTimerTask task = new BaseTimerTask(this);
        timer.schedule(task,0,1000);
    }

    @Override
    public Object setLayout() {
        return R.layout.delegate_launcher;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        initTimer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    //判断是否显示启动页
    private void checkIsShowScroll(){
        if (!LattePreference.getAppFlag(ScrollLauncherTag.HAS_FIRST_LAUNCHER_APP.name())){
            start(new LauncherScrollDelegate(),SINGLETASK);
        }else {
            //检查用户是否登录了APP

        }
    }

    @Override
    public void onTimer() {
        getProxyActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mTvLauncherTimer!=null){
                    mTvLauncherTimer.setText(MessageFormat.format("跳过\n{0}s",mCount));
                    mCount--;
                    if (mCount<0){
                        if (timer!=null){
                            timer.cancel();
                            timer = null;
                            checkIsShowScroll();
                        }
                    }
                }
            }
        });
    }
}
