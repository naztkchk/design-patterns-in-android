package com.vakoms.desingpatternsinandroid.observer

import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.fragment_listener.*

class FragmentListener: Fragment(), Observer {

    override fun update(checked: Boolean) {
        if (checked) {
            textView.text = "ON";
        } else {
            textView.text = "OFF";
        }
    }
}