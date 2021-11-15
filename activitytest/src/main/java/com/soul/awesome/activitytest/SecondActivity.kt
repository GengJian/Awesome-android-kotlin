package com.soul.awesome.activitytest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second_layout)

        val para = intent.getStringExtra("extra_data")
        Toast.makeText(this,"上个页面传值:$para", Toast.LENGTH_LONG).show()

    }
}