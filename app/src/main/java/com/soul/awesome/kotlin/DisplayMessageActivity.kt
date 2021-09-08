package com.soul.awesome.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // 从唤起此页面的Intent(上下文)中获取extra message
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        // 获取控件并更新text属性
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}