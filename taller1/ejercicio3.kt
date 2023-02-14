//ejercicio3  (Condicionales dobles)

// Funciona de la misma manera que el anterior, solo que estas estructuras
// permiten no solo ejecutar una determinada acción cuando se cumple 
// determinada condición, sino que en caso de que la condición no se 
// cumpla, brinda otro camino para realizar acciones diferentes.


// Algoritmo que solicite la edad de una persona, si la edad es menor
//  a 18 indique es la persona es menor de edad, de locontrario indique
//  que es mayor de edad


fun main(){
    println("ingrese la edad: ")
    val edad = readLine()!!.toInt()

    if(edad>18){
        println("la persona es mayor de edad")
    }else{
        println("la persona es menor de edad")
    }
    println("la edad es: $edad")
}
