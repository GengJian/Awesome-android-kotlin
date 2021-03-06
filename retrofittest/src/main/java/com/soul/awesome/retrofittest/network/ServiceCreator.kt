package com.soul.awesome.retrofittest.network

import com.soul.awesome.retrofittest.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Retrofit 构建器，创建接口动态代理
class ServiceCreator {

    // 静态方法&常量
    companion object {
        // Retrofit2中要求baseURL必须以/斜线结束，消除歧义
        private const val HOST_URL = "https://www.wanandroid.com/"
    }

    // 实例化OKHttp
    private val httpClient = OkHttpClient.Builder().apply {
        //添加日志拦截器
        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            addInterceptor(logging)
        }
    }.build()

    // 实例化Retrofit对象
    private val retrofit = Retrofit.Builder()
        .baseUrl(HOST_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient)
        .build()

    // 便于获取Service的动态代理对象
    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

    // 泛型实化
    inline fun <reified T> create(): T = create(T::class.java)
}

