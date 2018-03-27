package com.dsh.dhstore.generators;


import com.dsh.latte.wechat.templates.WXPayEntryTemplate;
import com.example.annotations.PayEntryGenerator;

/**
 * Created by 傅令杰 on 2017/4/22
 */
@SuppressWarnings("unused")
@PayEntryGenerator(
        packageName = "com.dsh.dhstore",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
