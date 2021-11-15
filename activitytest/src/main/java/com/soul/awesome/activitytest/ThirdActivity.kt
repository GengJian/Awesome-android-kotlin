package com.soul.awesome.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)

        Toast.makeText(this, "打开内置WebView", Toast.LENGTH_LONG).show()
    }
}