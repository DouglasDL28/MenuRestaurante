package com.example.douglasdeleon.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    fun onClick_menuButton (view: View) {
        val intent = Intent (this@MainActivity, MenuActivity::class.java)
        startActivity(intent)
    } //Botón para ir a Activity de menú.

    fun onClick_orderButton (view: View) {
        val intent = Intent (this@MainActivity, OrderActivity::class.java)
        startActivity(intent)
    } //Botón para ir al Activity del pedido.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
