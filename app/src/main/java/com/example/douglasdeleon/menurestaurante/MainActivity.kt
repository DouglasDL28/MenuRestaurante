package com.example.douglasdeleon.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun onClick_menuButton (view: View) {
            val intent = Intent (this, MenuActivity::class.java)
            startActivity(intent)
        }

        fun onClick_orderButton (view: View) {
            val intent = Intent (this, OrderActivity::class.java)
            startActivity(intent)
        }
    }
}