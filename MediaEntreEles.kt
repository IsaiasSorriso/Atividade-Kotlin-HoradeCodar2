fun main(){
        print("Digite o primeiro número (menor): ")
        val num1 = readLine()!!.toInt()

        print("Digite o segundo número (maior): ")
        val num2 = readLine()!!.toInt()

        var soma = 0
        var quantidade = 0

        for (i in num1..num2) {
            soma += i
            quantidade++
        }

        val media = soma.toDouble() / quantidade
        println("A média aritmética dos números entre $num1 e $num2 é: $media")
}
