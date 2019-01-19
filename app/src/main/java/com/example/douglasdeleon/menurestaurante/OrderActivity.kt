package com.example.douglasdeleon.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.douglasdeleon.menurestaurante.Logic.Application
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    val menu = Application.myMenuOrder

    fun onClick_homeButton (view: View) {
        val intent = Intent (this@OrderActivity, MainActivity::class.java)
        startActivity(intent)
    } //Boton para regresar al inicio.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val listView: ListView = findViewById(R.id.orderListView)

        val adapter = ArrayAdapter (this@OrderActivity, R.layout.listview_item, menu.menuOrder)

        listView.adapter = adapter

        listView.setOnItemLongClickListener { parent, view, position, id ->
            val itemPosition = position
            menu.del(itemPosition)

            Toast.makeText(this@OrderActivity, "Eliminado.", Toast.LENGTH_SHORT).show()

            listView.adapter = adapter

            return@setOnItemLongClickListener true
        } // Opción de presionar para eliminar elementos del pedido.

        orderButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                menu.done()
                Toast.makeText(this@OrderActivity, "Se a completado el pedido!", Toast.LENGTH_SHORT).show()
                listView.adapter = adapter
            }
        }) // Botón para completar el pedido.

        clearButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                menu.clear()
                Toast.makeText(this@OrderActivity, "Se ha eliminado el pedido.", Toast.LENGTH_SHORT).show()
                listView.adapter = adapter
            }
        }) //Botón para eliminar el pedido.

    }
}
