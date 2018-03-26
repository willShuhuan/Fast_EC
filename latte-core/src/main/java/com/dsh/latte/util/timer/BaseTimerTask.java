package com.dsh.latte.util.timer;

import java.util.TimerTask;

/**
 * Created by Adam on 2018/3/26.
 */

public class BaseTimerTask extends TimerTask{

    private ITimerListener mITimerListener = null;

    public BaseTimerTask(ITimerListener ITimerListener) {
        mITimerListener = ITimerListener;
    }

    @Override
    public void run() {
        if (mITimerListener!=null){
            mITimerListener.onTimer();
        }
    }
}
