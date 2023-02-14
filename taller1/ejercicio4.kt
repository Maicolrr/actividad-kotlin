// ejercicio 4 (Uso de when como expresión)

// También es posible utilizar when como una expresión en
// lugar de una sentencia, devolviendo un valor como resultado.


// Basado en el siguiente menú
// 1. Saludar
// 2. Pedir Nombre de una Persona
// 3. Sumar 2 Números
// Haga un algoritmo que dependiendo del código ingresado, realice la acción correspondiente.

fun main(){
    var Menu="""
    MENU DE OPCIONES
    1. Saludar
    2. Pedir Nombre de una Persona
    3. Sumar 2 Números
    INGRESE UN OPCION: 
    """
    println(Menu)
    var opicon = readLine()!!.toInt()

    when(opicon){
        1-> println("hola!")
        2-> {
            println("imgrese el nombre de una persona")
            var nombre = readLine()
            println("Hola! $nombre")
        }
        3-> {
            println("imgrese el primer numero")
            var numero1 = readLine()!!.toInt()

            println("imgrese el segundo numero")
            var numero2 = readLine()!!.toInt()

            var suma = numero1+numero2
            println("la suma de $numero1 y $numero2 es $suma")
        }
        else -> println("la opcion es invalida")
    }
}