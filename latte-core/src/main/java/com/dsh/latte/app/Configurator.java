package com.dsh.latte.app;

import android.util.Log;

import com.joanzapata.iconify.IconFontDescriptor;
import com.joanzapata.iconify.Iconify;

import java.util.ArrayList;
import java.util.HashMap;

import okhttp3.Interceptor;

/**
 * Created by Administrator on 2018/2/28.
 * 线程安全，配置
 */

public class Configurator {
    //传说键值对在不使用的时候会自动回收 避免内存爆满,static 变量大写，编程习惯
    private static final HashMap<Object,Object> LATTE_CONFIGS = new HashMap<>();
    private static final ArrayList<IconFontDescriptor> ICONS = new ArrayList<>();//字体图标
    private static final ArrayList<Interceptor> INTERCEPTORS = new ArrayList<>();

    private Configurator(){
        LATTE_CONFIGS.put(ConfigKeys.CONFIG_READY.name(),false);
    }

    //静态内部类，线程安全getInstance
    private  static class Holder{
        private  static final Configurator INSTANCE = new Configurator();
    }

    public static Configurator getInstance(){
        return Holder.INSTANCE;
    }

    final HashMap<Object,Object> getLatteConfigs(){
        return LATTE_CONFIGS;
    }

    public  final void configure(){
        initIcons();
        LATTE_CONFIGS.put(ConfigKeys.CONFIG_READY.name(),true);
    }

    public final Configurator withApiHost(String host){
        LATTE_CONFIGS.put(ConfigKeys.API_HOST.name(),host);
        Log.d("ExampleApp", "withApiHost: "+LATTE_CONFIGS);
        return this;
    }

    //检查是否config ready
    private void checkConfiguration(){
        //如无需更改，用final修饰，避免错误地修改变量
        final boolean isReady = (boolean) LATTE_CONFIGS.get(ConfigKeys.CONFIG_READY.name());
        if (!isReady){
            throw  new RuntimeException("config is not ready,call configure");
        }
    }

    private void initIcons(){
        if (ICONS.size()>0){
            final Iconify.IconifyInitializer initializer = Iconify.with(ICONS.get(0));
            for (int i = 1; i < ICONS.size(); i++) {
                initializer.with(ICONS.get(i));
            }
        }
    }

    public final Configurator withIcon(IconFontDescriptor descriptor){
        Log.d("", "Configurator withIcon: ");
        ICONS.add(descriptor);
        return this;
    }

    public final Configurator withInterceptor(Interceptor interceptor){
        INTERCEPTORS.add(interceptor);
        LATTE_CONFIGS.put(ConfigKeys.INTERCEPTOR,INTERCEPTORS);
        return this;
    }

    public final Configurator withInterceptors(ArrayList<Interceptor> interceptors){
        INTERCEPTORS.addAll(interceptors);
        LATTE_CONFIGS.put(ConfigKeys.INTERCEPTOR,INTERCEPTORS);
        return this;
    }


    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Object key) {
        checkConfiguration();
        final Object value = LATTE_CONFIGS.get(key);
        if (value == null) {
            throw new NullPointerException(key.toString() + " IS NULL");
        }
        return (T) LATTE_CONFIGS.get(key);
    }



}
