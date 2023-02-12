//2. Basado en el siguiente menú
// 1. Saludar
// 2. Pedir Nombre de una Persona
// 3. Sumar 2 Números
//Haga un algoritmo que dependiendo del código ingresado, realice la acción correspondiente

fun main(args:Array<String>) {
    println("Menu")
    println("1.Saludar")
    println("2.Pedir nombre de una persona")
    println("3.sumar dos numeros")
    println("Por favor Ingrese una opcion")

    val opcion= readLine()!!.toInt()

    when(opcion){
        1-> println("Hola!")
        2->{
            println("Ingrese el nombre")
            val nombre= readLine().toString()
            println("$nombre")
        }
        3->{
            println("Ingrese el primer numero")
            val num1= readLine()!!.toInt()
            println("Ingrese el segundo numero")
            val num2= readLine()!!.toInt()
            println("La suma de $num1 y $num2 es: ${num1+num2}")
        }
        else-> println("Opcion invalida")
    }

}