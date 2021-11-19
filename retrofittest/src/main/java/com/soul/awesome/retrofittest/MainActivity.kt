package com.soul.awesome.retrofittest

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.soul.awesome.retrofittest.network.ServiceCreator

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

    fun requestLogin() {
//        val userInfoService = ServiceCreator.create<UserInfoService>()
//        userInfoService.signIn("329@test.com", "123456")
//            .enqueue(object : Callback<VSResponseModel<LoginResponseData>> {
//                override fun onResponse(
//                    call: Call<VSResponseModel<LoginResponseData>>,
//                    response: Response<VSResponseModel<LoginResponseData>>
//                ) {
//                    Log.d("LoginTableFragment", "登录请求成功，返回 $response")
//                }
//
//                override fun onFailure(
//                    call: Call<VSResponseModel<LoginResponseData>>,
//                    t: Throwable
//                ) {
//                    Log.d("LoginTableFragment", "登录请示失败")
//                    t.printStackTrace()
//                }
//
//            })
    }
}