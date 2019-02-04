package com.vakoms.desingpatternsinandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vakoms.desingpatternsinandroid.observer.TestActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Observer pattern
        startActivity(Intent(this, TestActivity::class.java))

    }
}
