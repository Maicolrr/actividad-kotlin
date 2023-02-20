fun main() {
    var pair = Pair("Kotlin",2)
    var pair2 = "Kotlin" to 2
    var (user, password) =Pair("pepe_123","pepito12345")

    println(pair.first )//imprimo el primer caracter
    println(pair.second)//imprimo el segundo caracter

    println(pair2)//imprimo el primer caracter

    println("el nombre de usuario es: $user")
    println("la contraseña es: $password")

    // for (i in 0 pair2){
    //     println(i)
    // }
} 