package com.soul.awesome.retrofittest.network

import com.soul.awesome.retrofittest.model.BaseResponseModel
import com.soul.awesome.retrofittest.model.LoginResponseData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

/// 用户信息相关Api接口声明(Retrofit接口文件)
interface UserInfoService {
    // 登录
    @POST("iot/login")
    fun signIn(@Body email: String, password: String): Call<BaseResponseModel<LoginResponseData>>
}