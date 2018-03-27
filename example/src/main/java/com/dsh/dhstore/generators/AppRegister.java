package com.dsh.dhstore.generators;


import com.dsh.latte.wechat.templates.AppRegisterTemplate;
import com.example.annotations.AppRegisterGenerator;

/**
 * Created by 傅令杰 on 2017/4/22
 */
@SuppressWarnings("unused")
@AppRegisterGenerator(
        packageName = "com.dsh.dhstore",
        registerTemplate = AppRegisterTemplate.class
)
public interface AppRegister {
}
