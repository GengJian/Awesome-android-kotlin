package com.soul.awesome.retrofittest.network

import com.soul.awesome.retrofittest.base.BaseResponse
import com.soul.awesome.retrofittest.model.BaseResponseModel
import com.soul.awesome.retrofittest.model.LoginResponseData
import com.soul.awesome.retrofittest.model.RegisterModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/// 用户信息相关Api接口声明(Retrofit接口文件)
interface UserInfoService {
    // 注册
    @FormUrlEncoded
    @POST("user/register")
    suspend fun signUp(@Field("username") username: String, @Field("password") password: String, @Field("repassword") repassword: String): BaseResponse<RegisterModel>
}