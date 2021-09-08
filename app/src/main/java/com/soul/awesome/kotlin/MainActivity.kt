//这是主 activity。它是应用的入口点。当您构建和运行应用时，系统会启动此 Activity 的实例并加载其布局。

package com.soul.awesome.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*点击页面的Send按钮*/
    fun sendMessage(view: View) {
        // 发起Send Action
        println("点击了Send按钮")
    }
}