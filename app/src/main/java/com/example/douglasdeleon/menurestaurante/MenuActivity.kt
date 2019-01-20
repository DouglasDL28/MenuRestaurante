package com.example.douglasdeleon.menurestaurante

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.douglasdeleon.menurestaurante.Logic.Application
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity(){
    val menu = Application.myMenuOrder

    val list: ArrayList<String> = arrayListOf(
        "Shuco",
        "Shuco vegetariano",
        "Tortillas",
        "Shucazos",
        "Tacos",
        "Coca-Cola",
        "Jugo de papaya")

    fun onClick_homeButton(view: View) {
        val intent = Intent(this@MenuActivity, MainActivity::class.java)
        application.startActivity(intent)
    } //Botón para regresar al inicio.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val listView: ListView = findViewById(R.id.menuListView)

        val adapter = ArrayAdapter(this@MenuActivity, R.layout.listview_item, list) //Conexión del listView y el adapter para mostrar la lista.

        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Exito", Toast.LENGTH_SHORT).show()
            val item = listView.getItemAtPosition(position).toString()

            menu.add(item)

            listView.adapter = adapter
        } //Al hacer click, agrega el item seleccionado al MenuOrder.
    }
}
