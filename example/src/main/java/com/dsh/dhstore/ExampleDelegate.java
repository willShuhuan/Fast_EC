package com.dsh.dhstore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.dsh.latte.app.Latte;
import com.dsh.latte.delegates.LatteDelegate;
import com.dsh.latte.net.RestClient;
import com.dsh.latte.net.callback.IError;
import com.dsh.latte.net.callback.IFailure;
import com.dsh.latte.net.callback.ISuccess;

/**
 * Created by Administrator on 2018/2/28.
 */

public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

        testRestClient();
    }

    private void testRestClient(){

        RestClient.bulider()
//                .url("http://news.baidu.com/")
                .url("http://192.168.1.99/index")
//                .params("","")
                .loader(getActivity())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Toast.makeText(getContext(),response,Toast.LENGTH_SHORT).show();
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .build()
                .get();
    }

    @Override
    public void post(Runnable runnable) {

    }
}
