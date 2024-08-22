package com.example

import android.app.Activity
import android.app.Service
import android.content.BroadcastReceiver
import android.content.ContentProvider
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.IBinder


class MyActivity : Activity(){}
class MyService:Service(){
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
class MyReceiver:BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
    }
}

}