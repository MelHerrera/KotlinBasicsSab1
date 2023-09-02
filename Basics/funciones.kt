fun main(){
var miSuma = sumar()
var miSuma1 = sumar(100)

    println(miSuma)
    println(miSuma1)

    var saludo = "hola".firstLetterToUpper()

    println(saludo)
}

fun sumar():Int{
    return 10 + 10
}

fun sumar(num:Int):Int{
    return num + 10
}

fun String.firstLetterToUpper():String{
    //1. capturar la primera letra
    //2. convertirla a mayuscula
    //3. Unir toda la palabra
    //4. Devolver el resultado

    var firstLetter:String = this.get(0).toString()
    var lettersRight:String = this.substring(1)

    return firstLetter.toUpperCase() + lettersRight
}