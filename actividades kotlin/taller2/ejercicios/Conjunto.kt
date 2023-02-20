fun main (){
    var conjunto : Set<Int> = setOf(1, 2, 3, 4)//inmutable
    var conjuntoMezclado = setOf(1, 2.45,"hola", "m")//inmutable y con diferentes tipos de datos

    var conjuntoMezclado2 = mutableSetOf(1, 2.45,"hola", "m")//mutable y con diferentes tipos de datos
    
    println("conjunto: $conjunto")
    println("conjunto Mezclado: $conjuntoMezclado")
    println("conjunto Mezclado2: $conjuntoMezclado2")

    conjuntoMezclado2.add("juan")//añade
    println("conjunto Mezclado2 Actualizado: $conjuntoMezclado2")
    conjuntoMezclado2.remove(1)//elimina
    println("conjunto Mezclado2 Actualizado: $conjuntoMezclado2")
    conjuntoMezclado2.clear()//limpia
    println("conjunto Mezclado2 Actualizado: $conjuntoMezclado2")
///////////////////////////////////////////////////////////////////
    var suma : Int = 0

    for (i in conjunto) {
        println(i)
        suma+=i
    }
    println("la suma de los elementos del conjunto es: $suma")
}