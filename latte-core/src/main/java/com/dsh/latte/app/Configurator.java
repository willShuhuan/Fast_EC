package com.dsh.latte.app;

import android.util.Log;

import com.joanzapata.iconify.IconFontDescriptor;
import com.joanzapata.iconify.Iconify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * Created by Administrator on 2018/2/28.
 * 线程安全，配置
 */

public class Configurator {
    //传说键值对在不使用的时候会自动回收 避免内存爆满,static 变量大写，编程习惯
    private static final HashMap<String,Object> LATTE_CONFIGS = new HashMap<>();
    private static final ArrayList<IconFontDescriptor> ICONS = new ArrayList<>();//字体图标

    private Configurator(){
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(),false);
    }

    //静态内部类，线程安全getInstance
    private  static class Holder{
        private  static final Configurator INSTANCE = new Configurator();
    }

    public static Configurator getInstance(){
        return Holder.INSTANCE;
    }

    final HashMap<String,Object> getLatteConfigs(){
        return LATTE_CONFIGS;
    }

    public  final void configure(){
        initIcons();
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(),true);
    }

    public final Configurator withApiHost(String host){
        LATTE_CONFIGS.put(ConfigType.API_HOST.name(),host);
        Log.d("ExampleApp", "withApiHost: "+LATTE_CONFIGS);
        return this;
    }

    //检查是否config ready
    private void checkConfiguration(){
        //如无需更改，用final修饰，避免错误地修改变量
        final boolean isReady = (boolean) LATTE_CONFIGS.get(ConfigType.CONFIG_READY.name());
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


    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key){
        checkConfiguration();
        return (T) LATTE_CONFIGS.get(key.name());
    }



}
