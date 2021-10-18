package me.owen.andlogin.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.owen.andlogin.databinding.ActivityLoginBinding
import me.owen.andlogin.utils.SpUtil
import me.owen.annotation.JudgeLogin
import me.owen.annotation.LoginActivity
import me.owen.login.hook.AndLogin

@LoginActivity
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {
            SpUtil.login(binding.username.text.toString())
//            AndLogin.getInstance().handleIntent()
            var targetIntent = intent.getParcelableExtra<Intent>(AndLogin.TARGET_ACTIVITY_NAME)
            if (targetIntent != null) {
                startActivity(targetIntent)
            }
            finish()
        }
    }

    companion object {
        // 该方法用于返回是否登录
        @JudgeLogin
        @JvmStatic
        fun checkLogin(): Boolean {
            return SpUtil.isLogin()
        }
    }
}