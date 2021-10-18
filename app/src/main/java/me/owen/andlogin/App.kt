package me.owen.andlogin

import android.app.Application
import android.content.Context

/**
 *
 * @ProjectName:    AndLogin
 * @Package:        me.owen.andlogin
 * @ClassName:      App
 * @Description:    java类作用描述
 * @Author:         Owen
 * @CreateDate:     2021/10/18 0018 下午 8:05
 * @UpdateUser:     更新者
 * @UpdateDate:     2021/10/18 0018 下午 8:05
 * @UpdateRemark:   更新说明
 * @Version:        1.0
 */
class App : Application() {


    companion object {
        lateinit var mContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        mContext = this
    }

}