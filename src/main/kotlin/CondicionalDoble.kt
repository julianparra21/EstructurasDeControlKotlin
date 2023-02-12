//Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y
// con esto calcule el promedio de notas,
// valide que si el estudiante saca un promedio
// mayor o igual a 3.5 entonces indique que el estudiante ganó la materia,
// de lo contrario indique que la perdió, el mensaje deberá mencionar el nombre y la materia del estudiante.

fun main() {
    println("Ingrese el nombre del estudiante")
    var nombre= readLine()!!.toString()
    println("Ingrese el nombre de la materia")
    var materia= readLine()!!.toString()

    println("Ingrese la primera nota")
    var nota1= readLine()!!.toFloat()
    println("Ingrese la segunda nota")
    var nota2= readLine()!!.toFloat()
    println("Ingrese la tercera nota")
    var nota3= readLine()!!.toFloat()

    var promedio=(nota1+nota2+nota3)/3

    println("El promedio de las notas es: $promedio")
    if (promedio>=3.5){
        println("El estudiante $nombre GANO la materia $materia")

    }else{
        println("El estudiante $nombre PERDÍO la materia $materia")
    }

}