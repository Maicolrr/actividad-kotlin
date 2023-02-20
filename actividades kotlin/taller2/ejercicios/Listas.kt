fun main(){
    val lista = listOf(1, 2, 3, 4, 5) //no se puede modificar

    println(lista)
    for(i in lista){
         println(i)
    }

    val listaMutable = mutableListOf(1, 2, 3, 4, 5) //se puede modificar
    println("lista sin modificar"+listaMutable)
    listaMutable.add(6)
    println("lista modificada"+listaMutable)
    for(i in listaMutable){
         println(i)
    }

    val listaNombreMutable = mutableListOf("juan","pepe", "ana", "luis", "camilo") //se puede modificar
    println("lista  sin modificar"+listaNombreMutable)
    listaNombreMutable.removeAt(3)//elimina la posicion
    println("lista modificada"+listaNombreMutable)
    println("tamaño de la lista: "+listaNombreMutable.count())

}