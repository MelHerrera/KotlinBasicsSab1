fun main() {

    println("mi nombre es x")
    println("mi nombre es x1")

    println("Escriba su nombre:")
    var nombre = readLine()

    println(nombre)


    print("Escriba su edad:")
    var edad = readlnOrNull()

    var resultado:Int?  = 0;

    if(edad != null){
        resultado = edad?.toInt()?.times(100)
    }

    println(resultado)

}