package com.soul.awesome.activitytest

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    // 重写方法，快捷键Control+O
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You clicked Add ", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove ", Toast.LENGTH_SHORT)
                .show()
        }
        return true
    }
}