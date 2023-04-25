/**1) Escreva um programa que pergunte o raio de uma circunferência,
 * e em seguida mostre o diâmetro, comprimento e área da circunferência.
 *
 * @params [r] solicita o raio da circuferência para os cálculos de suas medidas
 * @return Sem valor de retorno (Unit)
 */

import kotlin.math.*

fun measurementsOfCircle(r: Double) {
    val d = 2 * r //Diâmetro
    val comp = 2 * Math.PI * r
    val area = Math.PI * r * r

    println("""
            As medidas de uma circuferência de raio $r são:
            - Diâmetro    = $d
            - Comprimento = $comp
            - Área        = $area
            
    """.trimIndent())
}
