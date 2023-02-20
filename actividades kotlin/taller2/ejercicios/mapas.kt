fun main() {
    val mapaNombres1 = mapOf("clave1" to "juan", "clave2" to "ana", "clave3" to "pepe")
    val mapaNombres2 = mutableMapOf(1 to "juan", 2 to "ana", 3 to "pepe")//modificable
    println("nombres: $mapaNombres1")
    println("nombres: $mapaNombres2")
    println("claves: ${mapaNombres2.keys}")//tre las claves
    println("valores: ${mapaNombres2.values}")//tre los valores
    println("la clave 2 tiene como valor: "+mapaNombres2[2])//tre los valores de una clave determinada
    
    mapaNombres2[4]="carlos"//agregar claves y valores
    mapaNombres2.put(5,"andres")//agregar claves y valores
    mapaNombres2.set(6,"yara")//agregar claves y valores
    println( "nombres: $mapaNombres2")

    for(dato in mapaNombres2){
        println("Clave${dato.key}: ${dato.value}")
    }
}