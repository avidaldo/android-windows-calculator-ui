package com.example.calculadorawindows

class Prueba {
    val propiedad = 0

    fun funcion1(){}
    fun funcion2(){}
}

fun Prueba.funcion3() : Int{
    return propiedad

}

fun main(){
    val p = Prueba()
    p.funcion3()
}