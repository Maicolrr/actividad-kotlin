// ejercicio 1 (Estructuras secuenciales.)

//Estas estructuras son las más simples ya que corresponden a los 
// algoritmos que se trabajan de forma secuencial, donde se tiene
// un inicio y un final, se realiza una ejecución sucesiva de una
// o más operaciones.

// Algoritmo que solicite el nombre de una persona y 3 notas, calcule el promedio de ellas

fun main() {
    print("Ingrese el nombre: ")
    var nombre=readLine()

    print("Ingrese la nota 1: ")
    var nota1:Double=readLine()!!.toDouble()//convertir el dato

    print("Ingrese la nota 2: ")
    var nota2:Double=readLine()!!.toDouble()

    print("Ingrese la nota 3: ")
    var nota3:Double=readLine()!!.toDouble()

    var prom:Double=(nota1+nota2+nota3)/3

    println("$nombre El promedio de notas es $prom")
}