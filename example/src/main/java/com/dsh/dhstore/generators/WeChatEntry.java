package com.dsh.dhstore.generators;


import com.dsh.latte.wechat.templates.WXEntryTemplate;
import com.example.annotations.EntryGenerator;

/**
 * Created by 傅令杰 on 2017/4/22
 */

@SuppressWarnings("unused")
@EntryGenerator(
        packageName = "com.dsh.dhstore",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {
}
