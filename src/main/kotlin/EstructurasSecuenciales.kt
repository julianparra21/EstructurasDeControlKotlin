//Algoritmo que calcule lo que gana un empleado con base a las horas trabajadas teniendo en cuenta que cada hora se paga a 2000,
// adicionalmente se le realiza unos descuentos con respecto a un impuesto de seguridad del 10% sobre su salario.

fun main() {
    println("Ingrese las horas trabajadas")
    var horasTrabajas= readLine()!!.toInt()
    var valorHora=2000
    var impuestoSeguridad=0.1
    var salarioBase=horasTrabajas*valorHora
    println("El salario base es: $salarioBase")
    var descuento=salarioBase*impuestoSeguridad
    println("Se hace un descuento en el salario base que representa el: $descuento")
    var salarioTotal=salarioBase-descuento
    println("EL salario neto que se debe pagar es: $salarioTotal")

}