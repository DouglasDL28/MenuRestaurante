package com.example.douglasdeleon.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        fun onClick_homeButton (view: View) {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

        fun onClick_clearButton (view: View) {

        }

        fun onClick_orderButton (view: View) {

        }
    }
}
