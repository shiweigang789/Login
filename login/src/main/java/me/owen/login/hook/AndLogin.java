package me.owen.login.hook;

import android.content.Context;

/**
 * @ProjectName: AndLogin
 * @Package: me.owen.login.hook
 * @ClassName: AndLogin
 * @Description: java类作用描述
 * @Author: Owen
 * @CreateDate: 2021/10/18 0018 下午 8:00
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/10/18 0018 下午 8:00
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class AndLogin {

    public static final String TARGET_ACTIVITY_NAME = "targetActivity";

    private static AndLogin instance;

    private AndLogin() {
    }

    public static AndLogin getInstance() {
        if (instance == null) {
            instance = new AndLogin();
        }
        return instance;
    }

    public void init(Context context) {
//        LogUtil.d("init");
        HookUtil.HookAms(context);
    }

}
