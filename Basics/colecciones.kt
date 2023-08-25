fun main() {

    //colecciones - arrreglos
    val mascotas = arrayOf("Gato", "Perro", "Cerdo")

    mascotas.forEach {
        println(it)
    }

    println(mascotas.get(1))

    //arreglo de numeros
    val edades:Array<Int> = arrayOf(21,22,23)

    for (el in edades){
        println(el)
    }

    val cantidades = intArrayOf(23, 554, 77)

    println(cantidades.get(0))

/*    cantidades.set(3, 999)

    println(cantidades.get(0))*/

    val miArregloGeneral:Array<Any> = arrayOf("Perro", 21, 33.33)

    for (elemento in miArregloGeneral)
        println(elemento)

    //diferentes formas para indicar el tamaño del arreglo
    var misNumerosDeLaSuerte:Array<Int> = Array(10, { 0 })

    misNumerosDeLaSuerte.set(0, 7)

    for (elemento in misNumerosDeLaSuerte)
        println(elemento)

    var misNumerosDeLaSuerte2:Array<Int?> = arrayOfNulls(5)
    for (elemento in misNumerosDeLaSuerte2)
        println(elemento)

    //colecciones - HashMaps

    var misClaves:HashMap<String, String> = HashMap()

    misClaves.put("M", "Masculino")
    misClaves.put("F", "Femenino")

    println(misClaves.get("F"))

    println(misClaves.keys)
    println(misClaves.values)
    println(misClaves.entries)
    println(misClaves.containsKey("Y"))

    misClaves.put("Y", "Yes")

    println(misClaves.get("Y"))


    //colecciones - ArrayList

    var myArrayList:ArrayList<Int> = ArrayList()

    myArrayList.add(200)

    println(myArrayList.get(0))

    myArrayList.add(666)


    println(myArrayList.get(1))

    var myArrayListGeneral:ArrayList<Any> = ArrayList()

    myArrayListGeneral.add("Gato")
    myArrayListGeneral.add(111)
    myArrayListGeneral.add(24)
    myArrayListGeneral.add(55.55)
    myArrayListGeneral.add(true)

    for (e in myArrayListGeneral){
        println(e)
    }

}