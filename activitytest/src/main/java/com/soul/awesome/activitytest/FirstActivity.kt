package com.soul.awesome.activitytest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.soul.awesome.activitytest.SecondActivity
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
            Toast.makeText(this, "You clicked Button 1 ", Toast.LENGTH_SHORT).show()

            // 1.显式调用跳转
//            val intent = Intent(this, SecondActivity::class.java)
            // 2.隐式调用跳转
//            val intent = Intent("com.soul.awesome.activitytest.ACTION_START")
//            intent.addCategory("com.soul.awesome.activitytest.MY_CATEGORY")
            // 3.双向参数
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("extra_data", "携带参数")
            // ================
            // 1.执行跳转
//            startActivity(intent)
            // 2.跳转携带函数
            startActivityForResult(intent, 1)
        }

        button2.setOnClickListener {
            // 唤起网页
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.baidu.com")
            startActivity(intent)
        }

        button3.setOnClickListener {
            // 拨打电话
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:10086")
            startActivity(intent)
        }
    }

    // 重写方法，快捷键Control+O
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    // 重写菜单中按钮响应方法
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You clicked Add ", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove ", Toast.LENGTH_SHORT)
                .show()
        }
        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val returnMsg = data ?. getStringExtra("data_return")
        when (resultCode) {
            RESULT_OK -> Log.e("FirstActivity", "returned Data is $returnMsg")
        }
    }
}