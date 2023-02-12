////Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3
// notas parciales y con esto calcule el promedio de notas,
// valide que si el estudiante saca un promedio mayor o igual a 3.5 entonces indique que el
// estudiante ganó la materia, de lo contrario indique que la perdió, en caso de perderla valide si
// se perdió con una nota mayor a 2.5 entonces el estudiante puede recuperar, el mensaje deberá mencionar el nombre y la materia del estudiante

fun main() {
    val nombre= readLine()!!
    val materia= readLine()!!
    val nota1= readLine()!!.toFloat()
    val nota2= readLine()!!.toFloat()
    val nota3= readLine()!!.toFloat()

    var promedio=(nota1+nota2+nota3)/3
    println("El promedio de las notas es: $promedio")

    if (promedio>=3.5){
        println("El estudiante $nombre GANO la materia $materia")

    }else{
        println("El estudiante $nombre PERDÍO la materia $materia")
        if (promedio>=2.5){
            println("$nombre puede recueperar ")

        }
    }
}