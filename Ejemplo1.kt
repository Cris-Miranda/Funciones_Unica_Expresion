package Funciones_unica_expresion

fun retornarSuperficie(lado: Int) = lado * lado
fun main(parametro: Array<String>) {
    print("Ingrese el valor del lado del cuadrado:")
    val la = readln().toInt()
    println("La superficie del cuadrado es ${retornarSuperficie(la)}")
}