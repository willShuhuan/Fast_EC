package com.dsh.latte.delegates;

/**
 * Created by Administrator on 2018/2/28.
 */

public abstract class LatteDelegate extends PermissionChekerDelegate {
    @SuppressWarnings("unchecked")
    public <T extends LatteDelegate> T getParentDelegate() {
        return (T) getParentFragment();
    }
}
