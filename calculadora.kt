fun main(){
    print("Digite 1° numero: ")
    val n1 = readLine()!!.toDouble()

    print("Digite 1° numero: \n")
    val n2 = readLine()!!.toDouble()

    val adcao = n1 + n2
    val subtra = n1 - n2
    val multi = n1 * n2
    val div = n1 / n2

    println("Adição: $n1 + $n2 = $adcao \n")
    println("Subtração: $n1 - $n2 = $subtra \n")
    println("Multiplicação: $n1 * $n2 = $multi \n")
    println("Divisão: $n1 / $n2 = $div \n")
}