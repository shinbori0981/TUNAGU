package com.example.tunagu

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

//３）初期化＆構築
class CustomApplication :Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

        //Configuration 構築
        //これがないと、書き込む実行できない（アプリが強制終了される）
        val config =RealmConfiguration.Builder()
            .allowWritesOnUiThread(true)
            .allowQueriesOnUiThread(true)
            .build()
        Realm.setDefaultConfiguration(config)
    }
}