package me.owen.andlogin.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.owen.andlogin.databinding.ActivityMainBinding
import me.owen.andlogin.utils.SpUtil

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            startActivity(Intent(this, TargetActivity1::class.java))
        }

        binding.btn2.setOnClickListener {
            startActivity(Intent(this, TargetActivity2::class.java))
        }

        binding.btn3.setOnClickListener {
            startActivity(Intent(this, TargetActivity3::class.java))
        }

        binding.btn4.setOnClickListener {
            SpUtil.logout()
            checkLogin()
        }
    }

    override fun onResume() {
        super.onResume()
        checkLogin()
    }

    fun checkLogin() {
        if (SpUtil.isLogin()) {
            binding.tvStatus.text = "已登录: " + SpUtil.getAccount()
        } else {
            binding.tvStatus.text = "当前未登录"
        }
    }
}