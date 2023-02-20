fun main (){
    var arreglo = arrayOf ("pepe", "juan","Maria","ana")

    
    println("tamaño es: ${arreglo.count()}")
    println("posicion 1: ${arreglo[0]}")
    println("posicion 2: ${arreglo[1]}")

    for(i in arreglo){
        println(i)
    }
}
