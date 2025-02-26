fun main() {
    print("Escreva um Numero: ")
    var n1 = readLine()!!.toDouble()

    print("Escreva um Numero: ")
    var n2 = readLine()!!.toDouble()

    var numMaior = if (n1 > n2) n1 else n2

    println("O número maior é $numMaior")
}