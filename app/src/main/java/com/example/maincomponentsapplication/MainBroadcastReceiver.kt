package com.example.maincomponentsapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MainBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent?.action == "com.example.maincomponents.MainBroadcastReceiver") {
            Toast.makeText(context, "Broadcast received!", Toast.LENGTH_SHORT).show()
        }
    }

}