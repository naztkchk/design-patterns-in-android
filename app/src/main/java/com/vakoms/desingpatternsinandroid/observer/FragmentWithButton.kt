package com.vakoms.desingpatternsinandroid.observer

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vakoms.desingpatternsinandroid.R
import kotlinx.android.synthetic.main.fragment_withbutton.*

class FragmentWithButton: Fragment(), Subject {

    private val listObservers = mutableListOf<Observer>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_withbutton, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
             notifyObservers()
        }
    }


    override fun register(observer: Observer) {
        if(!listObservers.contains(observer)) {
            listObservers.add(observer)
        }
    }

    override fun unregister(observer: Observer) {
        listObservers.add(observer)
    }

    override fun notifyObservers() {
        listObservers.forEach { it.update(button.isChecked) }
    }
}