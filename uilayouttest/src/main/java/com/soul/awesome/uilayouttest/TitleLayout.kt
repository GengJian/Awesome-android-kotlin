package com.soul.awesome.uilayouttest

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.common_navigationbar.view.*

open class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        // 动态加载一个xml不惧文件，构建一个inflater对象；并传入一个父视图；从右往左三步合并一步return
        LayoutInflater.from(context).inflate(R.layout.common_navigationbar, this)

//        //添加返回按钮的点击事件
//        navigationBackBtn.setOnClickListener {
//         val activity = context as Activity
//         activity.finish()
//        }

//        navigationEditButton.setOnClickListener {
//            Toast.makeText(context, "You clicked Edit button", Toast.LENGTH_SHORT).show()
//        }
    }
}