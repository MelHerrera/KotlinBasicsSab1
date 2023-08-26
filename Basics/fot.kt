fun main(){

    for (i in 0..5)
        println(i)

    var misNumerosDeLaSuerte = arrayOf(7,16,49,50)

    for (elem in misNumerosDeLaSuerte)
        println(elem)

    for (letra in 'a'..'z' step 6)
        println(letra)

    for (letra in 'f' downTo 'a')
        println(letra)

    for (letra in 'a' until  'f')
        println(letra)
}