package com.vakoms.desingpatternsinandroid.observer

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.vakoms.desingpatternsinandroid.R
import kotlinx.android.synthetic.main.activity_test_observer.*

class TestActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_test_observer)

        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, FragmentWithButton()).commit()

        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, FragmentWithButton()).commit()
        }

        button2.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout, FragmentListener()).commit()
        }
    }
}