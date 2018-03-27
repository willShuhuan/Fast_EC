package com.dsh.latte.app;

/**
 * Created by Administrator on 2018/2/28.
 * 枚举类在整个程序里是唯一的单例，只能被初始化一次，多线程安全惰性单列，线程安全懒汉模式
 */

public enum ConfigKeys {
    API_HOST,
    APPLICATION_CONTEXT,
    CONFIG_READY,
    ICON,
    LOADER_DELAYED,
    INTERCEPTOR,
    WE_CHAT_APP_ID,
    WE_CHAT_APP_SECRET,
    ACTIVITY,
    HANDLER,
    JAVASCRIPT_INTERFACE,
    WEB_HOST
}
