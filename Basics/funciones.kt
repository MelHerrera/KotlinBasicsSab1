fun main(){
var miSuma = sumar()
var miSuma1 = sumar(100)

    println(miSuma)
    println(miSuma1)
}

fun sumar():Int{
    return 10 + 10
}

fun sumar(num:Int):Int{
    return num + 10
}
