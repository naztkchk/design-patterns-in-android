package com.vakoms.desingpatternsinandroid.observer

interface Subject {
    fun register(observer: Observer)
    fun unregister(observer: Observer)
    fun notifyObservers()
}