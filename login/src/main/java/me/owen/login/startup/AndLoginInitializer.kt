package me.owen.login.startup

import android.content.Context
import androidx.startup.Initializer
import me.owen.login.hook.AndLogin

/**
 *
 * @ProjectName:    AndLogin
 * @Package:        me.owen.login.startup
 * @ClassName:      AndLoginInitializer
 * @Description:    java类作用描述
 * @Author:         Owen
 * @CreateDate:     2021/10/18 0018 下午 8:00
 * @UpdateUser:     更新者
 * @UpdateDate:     2021/10/18 0018 下午 8:00
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
class AndLoginInitializer: Initializer<Unit> {
    override fun create(context: Context) {
        AndLogin.getInstance().init(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return arrayListOf()
    }
}