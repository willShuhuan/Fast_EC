package com.dsh.latte.ec.database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by 傅令杰 on 2017/4/22
 */
@Entity(nameInDb = "user_profile")
public class UserProfile {
    @Id
    private long uid = 0;
    private String nickname = null;
    private String city = null;
    private String userphone = null;
    private String balance = null;
    @Generated(hash = 1054396857)
    public UserProfile(long uid, String nickname, String city, String userphone,
            String balance) {
        this.uid = uid;
        this.nickname = nickname;
        this.city = city;
        this.userphone = userphone;
        this.balance = balance;
    }

    @Generated(hash = 968487393)
    public UserProfile() {
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

}
