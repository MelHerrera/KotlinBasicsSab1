fun main(){
    var edad = 18;

    if(edad > 18 ){
        println("Mayor")
    }else{
        println("No es Mayor")
    }

    var msj = if (edad > 18) "Mayor" else "No es mayor"

    //operadores logicos
    //<  > <= >= == != ?:

    var x = null
    var y = 20
    var z = x ?: y

    println(z)

    //&&    ||

    var tienePermiso = true

    if(edad > 18 || tienePermiso)
    {
        println("Puede ir a la fiesta")
    }else{
    println("No Puede ir a la fiesta")
    }


}