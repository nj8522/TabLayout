package com.example.tablayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    lateinit var mFrameLayout : FrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       supportFragmentManager
           .beginTransaction()
           .replace(R.id.FrameLayout, TabFragment())
           .commit()



    }
}