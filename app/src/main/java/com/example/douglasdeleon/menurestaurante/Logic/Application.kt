package com.example.douglasdeleon.menurestaurante.Logic

import android.app.Application
import android.content.Context
import android.widget.Toast
import com.example.douglasdeleon.menurestaurante.MainActivity

class Application: Application() {

    companion object myMenuOrder: iMenuOrder {
        override val menuOrder: ArrayList<String> = ArrayList()

        override fun clear() {
            menuOrder.clear()
        }

        override fun done() {
            this.clear()
        }

        override fun add(element: String) {
            menuOrder.add(element)
        }

        override fun del(elementIndex: Int) {
            menuOrder.removeAt(elementIndex)
        }
    }

}