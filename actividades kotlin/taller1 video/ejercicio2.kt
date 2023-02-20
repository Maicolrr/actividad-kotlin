// ejercicio2 Condicionales simples

//Este tipo de estructuras permite ejecutar una determinada acción cuando 
// se cumple determinada condición.

//. Algoritmo que calcule solicite el nombre y la materia de un estudiante, 
// así como 3 notas parciales y con esto calcule el promedio de notas, 
// valide que si el estudiante saca un promedio menor que 3.5 entonces 
// indique que el estudiante perdió la materia, el mensaje deberá 
// mencionar el nombre y la materia del estudiante.

fun main(){
    println("ingrese el nombre:")
    var nombre = readLine()!!

    println("ingrese el materia:")
    var materia = readLine()!!

    println("ingrese el nota1:")
    var nota1:Double = readLine()!!.toDouble()

    println("ingrese el nota2:")
    var nota2:Double = readLine()!!.toDouble()

    println("ingrese el nota3:")
    var nota3:Double = readLine()!!.toDouble()

    var prom:Double = (nota1+nota2+nota3)/3
    println("el promedio de las notas es $prom")

    if(prom<3.5){
        println("el estudiante $nombre perdio la materia $materia")
    }
}