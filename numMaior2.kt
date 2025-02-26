fun main(){
    print("Digite um Valor: ")
    val num1 = readLine()!!.toDouble()

    print("Digite um Valor: ")
    val num2 = readLine()!!.toDouble()

    print("Digite um Valor: ")
    val num3 = readLine()!!.toDouble()

    val numMaior = maxOf(num1, num2, num3)

    println("O número maior é $numMaior")
}