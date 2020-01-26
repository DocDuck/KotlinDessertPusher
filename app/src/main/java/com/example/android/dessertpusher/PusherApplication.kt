package com.example.android.dessertpusher
import android.app.Application
import timber.log.Timber

class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Инитим тимблер в глобальном апликейшн классе
        Timber.plant(Timber.DebugTree())
    }
}