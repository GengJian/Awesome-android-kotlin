package com.soul.awesome.uilayouttest

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.common_navigationbar.view.*

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        // 动态加载一个xml布局文件，构建一个inflater对象；并传入一个父视图；从右往左三步合并一步return
        LayoutInflater.from(context).inflate(R.layout.common_navigationbar, this)

        val backBtn = findViewById<Button>(R.id.navBackButton)
        //添加返回按钮的点击事件
        backBtn.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
        //添加编辑按钮的点击事件
        val editBtn = findViewById<Button>(R.id.navEditButton)
        editBtn.setOnClickListener {
            Toast.makeText(context, "You clicked Edit button", Toast.LENGTH_SHORT).show()
        }
    }
}