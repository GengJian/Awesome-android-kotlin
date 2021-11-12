//这是主 activity。它是应用的入口点。当您构建和运行应用时，系统会启动此 Activity 的实例并加载其布局。

package com.soul.awesome.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

/*val声明不可变的常量，类似于let*/
const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 在布局文件中编写界面，然后通过setContentView引入进来
        setContentView(R.layout.activity_main)
        // 测试日志级别 v < d < i < w < e
        Log.d("😊 MainActivity", "😊 onCreate: execute")
        Log.e("😂 MainActivity", "😂 onCreate: execute")
    }

    /*点击页面的Send按钮*/
    fun sendMessage(view: View) {
        // 发起Send Action
        println("点击了Send按钮")

        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        // Intent 是在相互独立的组件（如两个 activity）之间提供运行时绑定功能的对象。Intent 表示应用执行某项操作的意图。
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent) //启动一个由Intent指定的DisplayMessageActivity实例
    }
}