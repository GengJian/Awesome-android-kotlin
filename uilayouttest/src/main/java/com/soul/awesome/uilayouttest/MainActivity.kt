package com.soul.awesome.uilayouttest

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        /* 测试EventBus，延时三秒后更新文案 */
        // 注册
        EventBus.getDefault().register(this)

        // 发送
        val testEvent = MessageEvent(329, "EventBus TestMessage")
        EventBus.getDefault().post(testEvent)

    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this)
        super.onDestroy()
    }

    // 订阅
    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(event: MessageEvent) {
        Log.d("EventBus", "接收到了EventBus传过来的bean $event")

        Handler().postDelayed({
             runOnUiThread {
                 val textView = findViewById<TextView>(R.id.event_bus_text_view)
                textView.text = event.message
             }}, 2000)
    }

}