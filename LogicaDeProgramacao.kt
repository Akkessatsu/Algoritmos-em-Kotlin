import kotlin.math.*

/**1) Escreva um programa que pergunte o raio de uma circunferência,
 * e em seguida mostre o diâmetro, comprimento e área da circunferência.
 *
 * @params [r] solicita o raio da circuferência para os cálculos de suas medidas
 * @return Sem valor de retorno (Unit)
 */

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

/**2) Ler um número inteiro e imprimir seu sucessor e seu antecessor.
 *
 * @params [n] número inteiro para checar seu sucessor e antecessor
 * @return Sem valor de retorno (Unit)
 */

fun successorAndAntecessor(n: Int) = println("""
    - Antecessor: ${n - 1}
    - Sucessor: ${n + 1}
    
""".trimIndent())

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

/**4) Fazer um programa que solicite 2 números e informe:
 *    - A soma dos números;
 *    - O produto do primeiro número pelo quadrado do segundo;
 *    - O quadrado do primeiro número;
 *    - A raiz quadrada da soma dos quadrados;
 *    - O seno da diferença do primeiro número pelo  segundo;
 *    - O módulo do primeiro número.
 *
 * @params [n1] [n2] valores inteiros utilizados para as computações requisitadas
 * @return Sem valor de retorno (Unit)
 */

fun resultsOf2Numbers(n1: Int, n2: Int) {
    val sum = n1 + n2; // Soma dos dois args
    val firstMultiplyBySqrOfSecond = n1 * (n2 * n2) // Produto do primeiro vezes quadrado do segundo
    val sqrOfFirst = n1 * n1 // Quadrado do primeiro número
    val pitagoras  = ((n1 * n1) + (n2 * n2)).toDouble().pow(0.5) // "Pitágoras" dos dois dois números
    val sinOfDiff = sin((n1 - n2).toDouble()) // Seno da diferenças dos dois args
    val abs = if (n1 >= 0) n1 else -n1 // Valor absoluto do primeiro arg

    println("""
            $n1 + $n2 = $sum
            $n1 * $n2^2 = $firstMultiplyBySqrOfSecond
            $n1^2 = $sqrOfFirst
            ($n1^2 + $n2^2)^ 1/2 = $pitagoras
            sin($n1 - $n2) = $sinOfDiff
            |$n1| = $abs
    """.trimIndent())

}

/**5) Receber um nome e imprimir as 4 primeiras letras do nome.
 *
 * @params [name] Uma string para a contagem dos 4 primeiros caracteres
 * @return Sem valor de retorno (Unit)
 */

fun printFirst4Char(name: String) {
    repeat(4) {
        print(name[it])
    }
    print("\n")
}

/**6) Receber um valor qualquer do teclado e imprimir esse valor com reajuste superior de 10%.
 *
 * @params [n] Valor do tipo inteiro a ser aumentado em 110%
 * @return Sem valor de retorno (Unit)
 */

fun increaseTo110Percent(n: Int) = println(n * 1.1)

/**7) Informar um preço de um produto e calcular novo preço com desconto de 9%.
 *
 * @params [n] Valor do tipo inteiro a ser reduzido em 9%
 * @return Sem valor de retorno (Unit)
 */

fun decreaseIn9Percent(n: Int) = println(n - n * 0.09)

/**8) Informe o tempo gasto numa viagem (em horas), a velocidade média e mostre a distância percorrida.
 *
 * @params [deltaX] Valor indicando a distância percorrida [deltaT] Valor indicando o tempo decorrido
 * @return Sem valor de retorno (Unit)
 */

fun mediumSpeed(deltaX: Double, deltaT: Double) = println("A velocidade média é: ${deltaX / deltaT}")

/**9) Fazer um programa que solicita um número decimal e imprime o correspondente em hexa e octal.
 *
 * @param [n1] Número a ser convertido a uma das bases [radix] base octal ou hexadecimal
 * @return Sem valor de retorno (Unit)
 */

fun toHexOrOctal(n: Int, radix: Int) {
    val decimalToHex = charArrayOf(
        'A', // Se remainder % 10 = 0
        'B', // Se remainder % 10 = 1
        'C', // Se remainder % 10 = 2
        'D', // Se remainder % 10 = 3
        'E', // Se remainder % 10 = 4
        'F'  // Se remainder % 10 = 5
    )
    var aux = n
    var numberConverted = ""

    when (radix) {
        16, 8 -> {
            while (aux != 0) {
                val digit = aux % radix

                numberConverted +=
                    if (radix == 16 && digit > 9) {
                        decimalToHex[(digit) % 10]
                    }
                    else {
                        digit
                    }
                aux /= radix
            }

        }
        else -> {
            println("Base inválida")
        }
    }

    println("O número $n na base $radix é ${numberConverted.reversed()}")
}
/**10) Calcule o salário líquido de um professor.
 * Será fornecido valor da hora aula, o número de aulas dadas
 * e a % de desconto do INSS sobre o valor bruto do salário.
 *
 * @params [valuePerClass] Valor de hora por aula, [numOfClasses] Número de aulas dadas, [percent] Porcento de desconto
 * @return Valor do tipo Double com a computação
 */

fun wageOfTeacher(valuePerClass: Double, numOfClasses: Int, percent: Int): Double {
    val total = valuePerClass * numOfClasses

    return total - (total * (percent / 100))
}

/**11) Determinar quanto tempo um corpo em repouso leva para atingir o solo a partir de certa altura informada pelo usuário.
 * Considere g = 9,8 m/s² e que a queda livre é determinada pela fórmula: H = Ho + VoT + (gT^2)/2.
 *
 * H = Ho + Vo * t + (g * t²) / 2
 * Estando em queda livre, sua altura inicial será considera 0 em relação ao solo e o mesmo para
 * sua velocidade, pois está em repouso
 * H = 0 + 0 +(g * t²) / 2
 * H = (g * t²) / 2
 * t² = (2 * H) / g
 * t = ((2 * H) / g)^ 1 / 2
 *
 * @params [h] altura em que o corpo em repouso está em relação ao solo
 * @return Valor em double indicando a estimativa de tempo necessária para alcançar o solo
 */
fun freeFall(h: Double) = (2 * h / 9.8).pow(0.5)

/**12) Fazer uma calculadora simples com as quatro operações.
 *
 * @params [opd1] Primeiro operando [opt] Operador [opd2] Segundo operando
 * @return Valor da computação de acordo com os operandos e operador passado do tipo Double
 *
 */

fun simpleCalculator(opd1: Double, opt: Char, opd2: Double): Double {
    return when(opt) {
        '+' -> { opd1 + opd2 }
        '-' -> { opd1 - opd2 }
        '*' -> { opd1 * opd2 }
        '/' -> { opd1 / opd2 }
        else -> {println("Operador desconhecido"); -1.0}
    }
}

/**13) Para doar sangue é necessário ter entre 18 e 67 anos.
 * Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.
 *
 * @params [age] Idade solicitada para a checagem se está no devido intervalo
 * @return Valor boolean se a checagem for true ou false
 */

fun canGiveBlood(age: Int) = age in 18..67

/**14) Escreva um programa que recebe um inteiro e diga se é par ou ímpar.
 *
 * @params [n] Número para realizar a checagem
 * @return Valor em string se é par (even) ou ímpar (odd)
 */

fun isOddOrEven(n: Int) = if (n % 2 == 0) "even" else "odd"

/**15) Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
 * - 10-14 infantil
 * - 15-17 juvenil
 * - 18-25 adulto
 *
 * @params [age] Idade para realizar a checagem nos dados intervalos
 * @return Valor em string indicando em que categoria está
 */

fun isInWhichHood(age: Int) =
    if (age in 10..14) "infantil"
    else if (age in 15..17) "juvenil"
    else "adulto"

/**16) Ler 1 número. Se positivo, imprimir raiz quadrada se não o quadrado.
 *
 * @params [n] Valor inteiro a ser checado
 * @return Valor da computação de acordo com a checagem do tipo Double
 */

fun sqrOrRoot(n: Double) = if (n <= 0 ) n * n else n.pow(0.5)

/**17) Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor.
 *
 * @params [n1] [n2] [n3] Valores para checar qual é maior
 * @return Valor maior dentre os 3
 */

fun maxOf3N(n1: Int, n2: Int, n3: Int) =
    if (n1 > n2)
        if (n1 > n3) n1
        else n3
    else if (n3 < n2) n2
    else n3

/**18) Receber um número do teclado e informar se ele é divisível por 10,
 *  por 5, por 2 ou se não é divisível por nenhum destes.
 *
 * @params [n] Número a ser checado nos casos passados
 * @return Valor do tipo String indicando os casos verdadeiros
 */

fun isDivBy(n: Int) = when {
     n % 10 == 0 -> "Divisível por 10, 5 e 2"
     n % 5 == 0  -> "Divisível por 5"
     n % 2 == 0  -> "Divisível por 2"
     else -> "Não é divisível por 2, nem 5, nem 10"
}

/**19) Um comerciante comprou um produto e quer vendê-lo com lucro de 45% se o valor da compra for menor que 20,00;
 * caso contrário, o lucro será de 30%. Entrar com o valor do produto e imprimir o valor da venda.
 *
 * @params [valueOfProduct] Valor do produto a ser usado na computação
 * @return Valor da venda com o lucro aplicado de acordo com condição
 */
fun saleOfProduct(valueOfProduct: Double) =
    if (valueOfProduct < 20.0) valueOfProduct + 0.45 * valueOfProduct
    else valueOfProduct + 0.30 * valueOfProduct

/**20) Ler a idade de uma pessoa e informar a sua classe eleitoral.
 *
 *  - Não-eleitor (abaixo de 16 anos)
 *  - Eleitor obrigatório (entre 18 e 65 anos)
 *  - Eleitor facultativo (entre 16 e 18 e maior de 65 anos).
 *
 *  @params [age] Valor da idade a ser checada
 *  @return Valor do tipo String da categoria "matched"
 */
fun checkCategoryOfVoter(age: Int) =
    if (age < 16)
        "Não-eleitor"
    else if (age in 18..65)
        "Eleitor obrigatório"
    else
        "Eleitor facultativo"

/**21) Faça um programa que leia 3 número inteiro os imprima em ordem crescente.
 *
 *  @params [sequence] Array contendo os elementos da sequência
 *  @return Retorna um array de inteiros primitivos com os números ordenados
 *
 * OBS: O programa realiza muitas recursões ao partir de 4 elementos e acima, sendo possível até 3
 * Erro: java.lang.StackOverflow -> A function Stack da JVM fica sem recursos para continuar, impedindo
 * a execução do resto do programa.
 * Sinal de algoritmo muito ineficiente :/
 */

fun bubbleSort(vararg sequence: Int): IntArray {
        var length = sequence.size - 1
        val res = sequence
        var swaps = true

        while(length > 0 && swaps) {
            swaps = false
            for (i in 0 .. length - 1) {
                if (res[i] > res[i + 1]) {
                    val aux = res[i + 1]
                    
                    res[i + 1] = res[i]
                    res[i] = aux
                    swaps = true

                }
            }
            length--
        }
    return res
}

/**22)Ler 3 números e verificar se eles podem ou não serem lados de um triângulo.
 *
 * @params [sides] Array de Double's contendo os 3 medidas de  lado de um triângulo
 * @return Retorna um valor booleano, indicando se é possível formar um triângulo ou não
 */

fun trianglePossible(sides: DoubleArray) =
        sides[0] + sides[1] > sides[2] &&
        sides[1] + sides[2] > sides[0] &&
        sides[0] + sides[1] > sides[2]

/**23) Construa um programa que peça os lados de um triângulo
 * e mostre o tipo do triângulo: como isósceles, escaleno ou equilátero.
 *
 * @params [sides] Array de Double's contendo os 3 lados de um triângulos
 * @return Indica se o triângulo é escaleno, isóceles ou equilátero
 *
 */
fun typeOfTriangle(sides: DoubleArray): String {
    var cnt = 0
    for (i in 0 until sides.size - 1) {
        if (sides[i] == sides[i + 1]) cnt++
    }
    return if (cnt == 2) "Equilátero" else if (cnt == 1) "Isóceles" else "Escaleno"
}

/**25) Calcular e imprimir o volume e a área de superfície de um cone reto, um cilindro ou uma esfera.
 *  O programa deverá ler a opção da figura desejada.
 *
 * @params [figure] [measurements] A figura e as suas respectivas medidas para o cálculo
 * @return O valor da superfície e área da respectiva figura
 */

fun measurementOfFigures() {
    println("Insira a figura (1 - Esfera | 2 - Cone | 3 - Cilindro)")

    val figure = readln().toInt()

    println("Insira o valor do raio")
    print(">>> ")
    val r = readln().toDouble()

    val areaAndVol: DoubleArray =
        when (figure) {
            1 -> {// Esfera
                    doubleArrayOf(
                        4 * PI * r.pow(2.0),
                        (4 / 3) * PI * r.pow(3.0)
                    )
            }
            2 -> { // Cone

                println("Insira o valor da geratriz")
                print(">>> ")
                val g = readln().toDouble()

                println("Insira o valor da altura")
                print(">>> ")
                val h = readln().toDouble()

                doubleArrayOf(
                    PI * r * (r + g),
                    (1 / 3) * PI * (r * r)
                )
            }
            3 -> { // Cilindro
                println("Insira o valor da altura")
                print(">>> ")
                val h = readln().toDouble()

                doubleArrayOf(
                    2 * (PI * (r * r)) + 2 * PI * r * h,
                    PI * r * h
                )

            }
        else -> doubleArrayOf(0.0)

    }

    println("""
        A área e o volume da figura são, respectivamente:
         Área: ${areaAndVol[0]} 
         Volume: ${areaAndVol[1]}
    """.trimIndent())
}

/** 26) Faça um programa que diz quantos dias um mês possui.
 *
 * @param [month] Valor do mês em string a ser computado
 * @return Valor dos dias do mês
 */

fun numberOfDays(month: String): Int {
    return when(month.lowercase()) {
        "janeiro","março","maio","julho","agosto","dezembro" -> 31
        "fevereiro" -> 28
        else -> 30
    }
}

/** 27) Faça um programa que recebe uma letra, escreva na tela se essa letra é ou não uma vogal.
 *
 * @param [letter] Letra do alfabeto latino
 * @return Indica se a letra é uma vogal ou não
 *
 */

fun isVowelOrConsonant(letter: Char) =
    when(letter.lowercaseChar()) {
        'a','e','i','o','u' -> "A letra $letter é vogal"
        else -> "A letra $letter é consoante"
    }

/** 28) Faça um programa que informe o mês de acordo com o número informado pelo usuário.
 * (Exemplo: Entrada: 4. Saída: Abril).
 *
 * @param [mon] Número do mês a ser encontrado
 * @return Valor do mês encontrado
 */

fun whichMonth(mon: Int) =
    when(mon) {
         1   -> "Janeiro"
         2   -> "Fevereiro"
         3   -> "Março"
         4   -> "Abril"
         5   -> "Maio"
         6   -> "Junho"
         7   -> "Julho"
         8   -> "Agosto"
         9   -> "Setembro"
        10   -> "Outubro"
        11   -> "Novembro"
        12   -> "Dezembro"
        else -> "Mês inválido"
    }

/** 29) Informe o tipo de carro (A, B e C) e a distância rodada em km,
 *  então mostre o consumo estimado, conforme o tipo, sendo (A=8, B=9 e C=12) km/litro.
 *
 * @param [type] Char contendo o tipo de carro passado
 * @return Inteiro informado o consumo estimado
 */

fun consume(type: Char) =
    when(type.lowercaseChar()) {
        'A'  -> 8
        'B'  -> 9
        'C'  -> 12
        else -> null
    }

/** 30) Escreva um aplicativo que mostra todos os números ímpares de 1 até 100.
 *
 * @param [max] Valor máximo do intervalo de ímpares [pace] Valor de step (2 para ímpar, 1 para par)
 * @return Sem valor de retorno (Unit)
 */

fun oddOrEven(max: Int = 100, start: Int = 1) {
    var pos = 1
    for (i in start..100 step 2) {
        println("${pos++}º: $i")
    }
}

/** 32) Escreva um programa que solicita 10 números ao usuário,
 * através de um laço while, e ao final mostre qual destes números é o maior.
 *
 * @param Sem valor de parâmetros
 * @return Retorna o maior valor da sequência
 */

fun tenNumbers(): Int {
    val sequence = IntArray(10) {0}

    repeat(10) {
        println("Insira o ${it}º número")
        print(">>> ")
        sequence[it] = readln().toInt()
    }

    return bubbleSort(*sequence)[sequence.size - 1]
}

/** 33) Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
 * Em seguida, através de um laço while, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.
 * Por fim, o programa deve mostrar a média aritmética da turma.
 *
 * @param [numberOfStudents] Valor contendo o número de iterações a serem realizadas
 * @return média da turma
 */

fun averageOfClass(numberOfStudents: Int): Double {
    var total = 0.0
    var iterations = numberOfStudents

    while (iterations != 0) {
        println("Insira a média do ${iterations}º aluno:")
        print(">>> ")
        total += readln().toInt()
        iterations--
    }

    return total / numberOfStudents
}

/** 34) Faça um programa que, para um número indeterminado de pessoas: leia a idade de cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser considerada. A seguir calcule:
 *• o número de pessoas;
 *• a idade média do grupo;
 *• a menor idade e a maior idade.
 *
 * @params Sem valores de parâmetro
 * @return String contendo as informações desejadas
 *
 */

fun ageOfGroup(): String {
    val ages = MutableList<Int>(1) {0}

    while (true) {
        println("Insira a idade da ${ages.size}º pessoa")
        print(">>> ")

        val age = readln().toInt()

        if (age != 0)
            ages.add(age)
        else
            break
    }

    val sorted = bubbleSort(*ages.toIntArray())
    val average = ages.reduce {acc, age -> acc + age} / (ages.size - 1).toDouble()

    return """
        O número de pessoas inseridas foi: ${ages.size - 1}
        A média de idades foi: ${String.format("%.2f",average)}
        O maior valor passado foi: ${sorted[sorted.size - 1]}
        O menor valor passado foi: ${sorted[1]}
    """.trimIndent()
}

/**35) Ler 5 números e informar quantos desses são ímpares.
 *
 * @params[numbers] Array contendo os inteiros a serem checados
 * @return Valor Int indicando quantos são ímpares
 *
 */

fun isOddOrEven(vararg numbers: Int, odd: Boolean = true): Int {
    var cnt = 0
    for (elm in numbers) {
        if (odd) {
            if (elm % 2 != 0)
                cnt++
        }
        else
            if (elm % 2 == 0)
                cnt++

    }

    return cnt
}

/** 37) Escreva um aplicativo que recebe um inteiro e mostra os números pares e ímpares
 *  (separados, em duas colunas), de 1 até esse inteiro. Como o primeiro número é ímpar (1),
 *  os ímpares serão exibidos primeiro. Após cada ímpar,
 *  damos o espaço de um TAB (\t), e na mesma linha imprimimos o par, e logo em seguinte o caractere (\n).
 *
 *  @param [max] Valor máximo do intervalo
 *  @return String contendo a tabelas de ímpares e pares
 */

fun tableOfOddsAndEvens(max: Int) {
    print(String.format("%5s", "ÍMPARES"))
    print(String.format("%5c", ' '))
    print(String.format("%5s", "PARES"))
    println()
    for(n in 1 until max) {
        print(String.format("%5d",n))
        print(String.format("%5c", '-'))
        print(String.format("%5d",n + 1))
        println()
    }
}

/**38) Ler a altura e o sexo de 15 pessoas (M para homem e F para mulher) e informe
 * 1 - a menor e a maior altura,
 * 2 - media da altura dos homens,
 * 3 - a altura da mulher mais alta
 * 4 - quantos eram os homens
 *
 * @params Sem valores de parâmetro
 * @return String contendo os dados requeridos
 */

fun heightOfPeople(): String {
    val male = MutableList<Double>(1) {0.0}
    val female = MutableList<Double>(1) {0.0}
    val all = DoubleArray(15) {0.0}

    for (i in 0 .. 14) {
        println("Insira o sexo da ${i + 1}º pessoa (M - masculino | F - feminino)")
        print(">>> ")
        val genre = readln()

        println("Insira a altura da pessoa")
        print(">>> ")
        val h = readln().toDouble()

        when (genre) {

            "M" -> {
                female.add(h)
            }
            "F" -> {
                male.add(h)
            }
            else -> {
                println("Opção inválida de gênero")
            }
        }

        all[i] = h

    }

    val sorted = all.sortedArray()
    val maleSort = male.sorted()
    val femaleSort = female.sorted()

    return """
        A maior altura foi ${sorted[sorted.size]}
        A menor altura foi ${sorted[1]}
        A média das alturas dos homens é ${maleSort.reduce{acc, value -> acc + value} / maleSort.size - 1}
        A altura da mulher mais alta foi ${femaleSort[femaleSort.size - 1]}
        O número de homens é ${maleSort.size - 1}
    """.trimIndent()
}

/**39) Capture uma lista de 10 valores inteiros, salvando-a em um vetor: int lista [10]. Em seguida, escolha entre as opções:
 * 1 - Listar em ordem crescente
 * 2 - Listar em ordem decrescente
 * 3 - Listar na ordem original
 *
 * @param [lista] IntArray contendo os valores passados
 * @return Listagem dos elementos de acordo com a opção passada
 *
 */

fun listNumbers(vararg lista: Int) {
    println("Insira uma das opções abaixo")
    println("""
        1 - Listar em ordem crescente
        2 - Listar em ordem decrescente
        3 - Listar na ordem original
    """.trimIndent())
    print(">>> \n")
    val opt = readln().toInt()

    val arr = when(3) {
        1 -> bubbleSort(*lista)
        2 -> bubbleSort(*lista).reversedArray()
        else -> lista
    }
    println("Os elementos são:")
    for ( (index, elm) in arr.withIndex())
        println("${index + 1}: $elm")

}
