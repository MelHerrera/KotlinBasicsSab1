import java.util.Random

open class Animal{
    var color:String = ""
    var nombre:String = ""
    var sonido:String = ""

    constructor(color:String, nombre:String){
        this.color = color
        this.nombre = nombre
    }

    open fun hacerSonido(){
        println("rrrrrr...")
    }
}

class Vaca(nombre: String, color: String): Animal(nombre, color) {
    override fun hacerSonido(){
        println("muhhh...")
    }

}

fun main(){
    var vaca:Animal = Vaca("Gris", "Mar")

    println(vaca.color)

    vaca.color = "rojo"

    println(vaca.color)
    println(vaca.nombre)
    vaca.hacerSonido()


    var miCaja:Caja<Int> = Caja<Int>()
    miCaja.guardarEnCaja(10)
    miCaja.guardarEnCaja(15)
    miCaja.guardarEnCaja(6)
    miCaja.guardarEnCaja(77)
    miCaja.guardarEnCaja(999)

    println(miCaja.revolverCaja())


    var miCajaDobles:Caja<Double> = Caja<Double>()
    miCajaDobles.guardarEnCaja(10.5)
    miCajaDobles.guardarEnCaja(15.7)
    miCajaDobles.guardarEnCaja(6.7)
    miCajaDobles.guardarEnCaja(77.7)
    miCajaDobles.guardarEnCaja(999.6)

    println(miCajaDobles.revolverCaja())
}

class Caja<T>{
    var articulos:ArrayList<T> = ArrayList()
    //var articulosString:String = ""
    fun guardarEnCaja(item:T){
       articulos.add(item)
    }

    fun revolverCaja():T{
        var indice = Random().nextInt(articulos.size)
        return articulos.get(indice)
    }
}