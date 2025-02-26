fun main(){
    print("Digite um número: ")
    val num = readLine()!!.toDouble()

    when{
        num > 0 -> println("$num é positivo")
        num < 0 -> println("$num é negativo")
        else -> println("$num é = 0")
    }
}