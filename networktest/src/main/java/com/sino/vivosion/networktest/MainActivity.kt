package com.sino.vivosion.networktest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import okhttp3.Callback
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendRquestButton.setOnClickListener {
//            sendRequestWithHttpURLConnect()
//            sendRequestWithOKHttp()
            sendRequestWithOKHttpWithCallBack(object : Callback {
                override fun onResponse(call: Call, response: Response) {
                    // 得到服务器的返回内容
                    var responseData = response.body?.string()
                    if (responseData != null) {
                        showResponse(responseData)
                    }
                }

                override fun onFailure(call: Call, e: IOException) {
                    // 异常情况处理
                    Log.e("NetworkTest","请求失败")
                }
            })
        }

    }

    // 通过系统自带的HttpURLConnection实现一个GET请求
    fun sendRequestWithHttpURLConnect() {
        // 开启线程发起网络请求
        thread {
            var connection: HttpURLConnection? = null
            try {
                val response = StringBuilder()
                val url = URL("https://www.baidu.com")

                connection = url.openConnection() as HttpURLConnection
                connection.connectTimeout = 8000
                connection.readTimeout = 8000

                val input = connection.inputStream
                // 解析 获取到的输入流
                var reader = BufferedReader(InputStreamReader(input))
                reader.use {
                    reader.forEachLine {
                        response.append(it)
                    }
                }
                showResponse(response.toString())

            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                connection?.disconnect()
            }
        }
    }

    // 通过OKHttp框架请求
    fun sendRequestWithOKHttp() {
        thread {
            try {
                val client = OkHttpClient()
                val request = Request.Builder()
                    .url("https://www.baidu.com")
                    .build()
                val response = client.newCall(request).execute()
                val responseData = response.body?.string()
                if (responseData != null) {
                    showResponse(responseData)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {

            }
        }
    }

    // 通过OKHttp并异步回调响应数据
    fun sendRequestWithOKHttpWithCallBack(callback: Callback) {
        thread {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url("https://www.baidu.com")
                .build()

            client.newCall(request).enqueue(callback)
        }
    }

    //打印日志至界面
    fun showResponse(response: String) {
        runOnUiThread {
            // UI 操作放至 UI线程中
            Log.e("请求返回内容", response)
            responseText.text = response
        }
    }
}