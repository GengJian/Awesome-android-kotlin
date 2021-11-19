package com.soul.awesome.retrofittest

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.soul.awesome.retrofittest.network.ServiceCreator
import com.soul.awesome.retrofittest.network.UserInfoService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.button_login)
        loginButton?.setOnClickListener {
            Log.d("NetworkTest", "点击登录")
            requestLogin()
        }
    }

    private fun requestLogin() {
        val userInfoData = ServiceCreator().create<UserInfoService>()
        CoroutineScope(Dispatchers.IO).launch {
            val result = userInfoData.signUp("test12345671111","123456","123456")
            withContext(Dispatchers.Main) {
                Toast.makeText(this@MainActivity, "result is $result and nickname is ${result.data?.nickname}", Toast.LENGTH_LONG).show()
            }
        }
    }
}