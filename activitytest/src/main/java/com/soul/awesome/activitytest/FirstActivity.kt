package com.soul.awesome.activitytest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.first_layout.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)

        // 通过FindById 找到控件实例
//        val button1:Button = findViewById(R.id.button1)
//        button1.setOnClickListener {
//            Toast.makeText(this, "You clicked Button 1 ", Toast.LENGTH_SHORT).show()
//        }

        // Kotlin直接实例
        button1.setOnClickListener {
            Toast.makeText(this, "You clicked Button 1 ", Toast.LENGTH_LONG).show()
        }
    }
}