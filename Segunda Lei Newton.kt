fun main() {
    println(newton(50, 10)) // chamando funcao que vai realizar o calculo e exibindo retorno na tela
}

fun newton (m: Int, a: Int = 1): Int {
    return m * a    // retornando resultado do calculo da formula
}