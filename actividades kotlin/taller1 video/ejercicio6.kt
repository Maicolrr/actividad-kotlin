// ejercicio6 (while)

// Este ciclo hace uso de una condición en la que se valida la condición
// de parada, si esta condición es verdadera entonces se ingresa al ciclo
// repitiendose hasta que la condición sea Falsa y el ciclo termine.

// Haga un algoritmo que solicite un número y si este es negativo lo 
// convierta a positivo y lo imprima, realice este proceso n cantidad de 
// veces.

fun main(){
    var numero :Int
    var continuar ="si"

    while(continuar.uppercase()== "SI"){

        print("ingrese un numero: ")
        numero = readLine()!!.toInt()
        
        if(numero <0){
            numero = numero *(-1)
        }

        println("el numero positivo es: $numero")
        print("Desea ingresear otro numero? (SI/NO): ")
        continuar = readLine()!!
    }

}