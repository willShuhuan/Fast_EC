package com.dsh.latte.ec.sign;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dsh.latte.app.AccountManager;
import com.dsh.latte.ec.database.DatabaseManager;
import com.dsh.latte.ec.database.UserProfile;

/**
 * Created by 傅令杰 on 2017/4/22
 */

public class SignHandler {

    public static void onSignIn(String response, ISignListener signListener) {
        final JSONObject profileJson = JSON.parseObject(response).getJSONObject("data");
        final long uid = profileJson.getLong("uid");
        final String nickname = profileJson.getString("nickname");
        final String city = profileJson.getString("city");
        final String userphone = profileJson.getString("userphone");
        final String balance = profileJson.getString("balance");

        final UserProfile profile = new UserProfile(uid, nickname, city, userphone, balance);
        DatabaseManager.getInstance().getDao().insert(profile);

        //已经注册并登录成功了
        AccountManager.setSignState(true);
        signListener.onSignInSuccess();
    }


    public static void onSignUp(String response, ISignListener signListener) {
        final JSONObject profileJson = JSON.parseObject(response).getJSONObject("data");
        final long uid = profileJson.getLong("uid");
        final String nickname = profileJson.getString("nickname");
        final String city = profileJson.getString("city");
        final String userphone = profileJson.getString("userphone");
        final String balance = profileJson.getString("balance");

        final UserProfile profile = new UserProfile(uid, nickname, city, userphone, balance);
        DatabaseManager.getInstance().getDao().insert(profile);

        //已经注册并登录成功了
        AccountManager.setSignState(true);
        signListener.onSignUpSuccess();
    }
}
