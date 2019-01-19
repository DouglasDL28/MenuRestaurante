package com.example.douglasdeleon.menurestaurante.Logic

interface iMenuOrder {

    val menuOrder: ArrayList<String> // Pedido

    fun clear() // Limpiar pedido
    fun add(element: String) {
        menuOrder.add(element)
    } // Agregar elemento
    fun del(elementIndex: Int){
        menuOrder.removeAt(elementIndex)
    } // Elimina elemento
    fun done() // Realiza pedido
}