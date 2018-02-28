package com.dsh.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by Administrator on 2018/2/28.
 */

public enum EcIcons implements Icon {
    icon_scan('\ue606'),
    icon_ali_pay('\ue606');

    private char character;

    EcIcons(char character){
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
