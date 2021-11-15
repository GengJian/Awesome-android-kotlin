package com.soul.awesome.activitytest

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_layout.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second_layout)

        val para = intent.getStringExtra("extra_data")
        Toast.makeText(this,"上个页面传值:$para", Toast.LENGTH_LONG).show()


        login.setOnClickListener {
           val text = username.text ?: "xxx"
            val intent = Intent()
            intent.putExtra("data_return", "Hello $text")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}