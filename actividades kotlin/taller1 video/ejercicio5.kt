//ejercicio5 (do -while)

//es una estructura de control de repetición en Kotlin que se utiliza 
// para ejecutar un bloque de código al menos una vez y luego repetir 
// el bloque mientras se cumpla una determinada condición.

// Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
// 1. Sumar
// 2. Restar
// 3. Multiplicar
// 4. Dividir
// 5. Finalizar
// Haga el sistema con ciclos y valide que el segundo numero no sea 
// negativo o cero en la opción 4


fun main() {

    var menu="""
    MENU DE OPCIONES
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Finalizar
    """

    var opcion: Int
    var numero1: Float//* */
    var numero2: Float

    do {

        println("Ingrese el primer número: ")
        numero1 = readLine()!!.toFloat()

        println("Ingrese el segundo número: ")
        numero2 = readLine()!!.toFloat()

        println(menu)

        print("ingrese una opcion: ")//* */
        opcion = readLine()!!.toInt()

        when (opcion) {

            1 -> {
                var suma = numero1+numero2
                println("La suma es: $suma")
            }
            2 -> println("La resta es: ${numero1 - numero2}")//* */
            3 -> println("La multiplicación es: ${numero1 * numero2}")
            4 -> {
                if (numero2 > 0) {
                    println("La división es: ${numero1 / numero2}")
                } else {
                    println("la division no se puede realizar porque hay un dato negativo o es cero.")
                }
            }
            5 -> println("Programa finalizado.")
            else -> println("Opción inválida.")
        }
    } while (opcion != 5)
}