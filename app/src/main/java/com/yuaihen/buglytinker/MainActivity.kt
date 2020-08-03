package com.yuaihen.buglytinker

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val result: String? = null
        val result: String = "This is fixed version"
        tv_msg.text = "This is fixed version"
        btn_start.setOnClickListener {
//            CrashReport.testJavaCrash()
            Toast.makeText(this, result, Toast.LENGTH_LONG).show()
        }

    }
}