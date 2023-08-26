import java.text.SimpleDateFormat
import java.util.Date

fun main(){
    var dateF = SimpleDateFormat("EEEE")
    var fechaActual = Date()
    var diaDeLaSemana = dateF.format(fechaActual)

    println(diaDeLaSemana)

    when(diaDeLaSemana){
        "lunes" -> println("Hoy es $diaDeLaSemana ")
        "martes" -> println("Hoy es ${ diaDeLaSemana }")
        "miercoles" -> println("Hoy es ${ diaDeLaSemana }")
        "jueves" -> println("Hoy es ${ diaDeLaSemana }")
        "viernes" -> println("Hoy es ${ diaDeLaSemana }")
        "sábado" -> println("Hoy es ${ diaDeLaSemana }")
        "domingo" -> println("Hoy es ${ diaDeLaSemana }")
        else -> println("Incorrecto...")
    }
}