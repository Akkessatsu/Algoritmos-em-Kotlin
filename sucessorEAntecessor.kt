/**2) Ler um número inteiro e imprimir seu sucessor e seu antecessor.
 *
 * @params [n] número inteiro para checar seu sucessor e antecessor
 * @return Sem valor de retorno (Unit)
 */

fun successorAndAntecessor(n: Int) = println("""
    - Antecessor: ${n - 1}
    - Sucessor: ${n + 1}
    
""".trimIndent())
