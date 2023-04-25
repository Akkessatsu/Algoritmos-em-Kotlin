/**3) Fazer um programa que pergunta um valor em metros
 * e imprime o correspondente em decímetros, centímetros e milímetros.
 *
 * @params [m] grandeza medida em metros a ser utilizada na conversão
 * @return Sem valor de retorno (Unit)
 */

fun metersToDecCentiMili(m: Double) = println("""
    A medida em: $m metros equivale a:
    ${m / 10} decímetros, ${m / 100} centímetros e ${m / 1000} milímetros
    
""".trimIndent())
