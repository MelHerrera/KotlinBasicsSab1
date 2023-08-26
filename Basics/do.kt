fun main(){
    //do
    var cantidad = 5

    while (cantidad <= 5){
        println(cantidad)

        cantidad++
    }

    do {
        println("¿Cuantos dias tiene la semana?")
        println("a. 5 dias")
        println("b. 10 dias")
        println("c. 7 dias")

        println("Ingrese su respuesta:")
        var res = readLine()

    }while (res != "c")
}