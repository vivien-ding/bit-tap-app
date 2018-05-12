package me.viviending.bittap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.Button
import android.support.v4.content.ContextCompat.startActivity






class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    fun goToReceive(view: View) {
        val intent = Intent(this, ReceiveActivity::class.java)
        startActivity(intent)
    }

//    fun goToAdd(view: View) {
//        val intent = Intent(this, SendActivity::class.java)
//        startActivity(intent)
//    }

    fun goToSend(view: View) {
        val intent = Intent(this, SendActivity::class.java)
        startActivity(intent)
    }


}




