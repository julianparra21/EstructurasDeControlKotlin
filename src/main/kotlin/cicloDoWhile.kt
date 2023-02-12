//Algoritmo que solicite 2 numeros y realice el siguiente
// proceso del menú 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5.
// Finalizar Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4
fun main() {
    var opcion:Int
    var num1:Float
    var num2:Float

    do {
        println("Ingrese el primer numero")
        num1= readLine()!!.toFloat()
        println("Ingrese el segundo numero")
        num2= readLine()!!.toFloat()

        println("Elija una opcion \n1.sumar\n2.restar\n3.multiplicar\n4.dividid\n5.finalizar")
        opcion= readLine()!!.toInt()
        when(opcion){
            1->println("La suma es ${num1+num2}")
            2-> println("La resta es ${num1-num2}")
            3-> println("La multiplicacion es: ${num1*num2}")
            4->{
                if (num2<=0){
                    println("el segundo numero no puede ser negativo o cero")
                }else{
                    println("La division es: ${num1/num2}")
                }
            }
            5-> println("Programa Finalizado")

            else-> println("Opcion invalida")
        }
    }while (opcion!=5)

}