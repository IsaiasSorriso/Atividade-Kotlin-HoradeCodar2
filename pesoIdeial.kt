fun main(){

    print("Vamos Medir seu peso ideial?")
    print("Você é biologicamente homem ou mulher? \n Digite 1 pra escolher Homem \n" +
            " Digite 2 pra escolher Mulher \n")
    val escolha = readLine()!!.toInt()

    when(escolha){
        1 -> {
            print("Qual a Sua altura metro: ")
            val altura = readLine()!!.toDouble()

            val peso = (72.7 * altura) - 58

            println("Seu peso ideial é: $peso Kg")
        }
        2 -> {
            print("Qual a Sua altura em metros: ")
            val altura = readLine()!!.toDouble()

            val peso = (62.1 * altura) - 44.7

            println("Seu peso ideial é: $peso Kg")
        }
    }
}