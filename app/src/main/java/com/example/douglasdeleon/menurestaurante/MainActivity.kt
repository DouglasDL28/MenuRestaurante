package com.example.douglasdeleon.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.douglasdeleon.menurestaurante.Logic.Application
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun onClick_menuButton (view: View) {
        val intent = Intent (this@MainActivity, MenuActivity::class.java)
        startActivity(intent)
    }

    fun onClick_orderButton (view: View) {
        val intent = Intent (this@MainActivity, OrderActivity::class.java)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
