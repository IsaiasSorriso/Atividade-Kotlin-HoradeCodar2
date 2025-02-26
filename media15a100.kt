fun main(){
    print("Digite o primeiro Número de 15 a 100: ")
    var num1 = readLine()!!.toDouble()

    print("Digite o segundo Número de 15 a 100: ")
    var num2 = readLine()!!.toDouble()

    while (num1 > 100 || num1 < 15){
        print("Digite o primeiro Número de 15 a 100 ANIMAL: ")
         num1 = readLine()!!.toDouble()
    }

    while (num2 > 100 || num2 < 15){
        print("Digite o segundo Número de 15 a 100 ANIMAL: ")
        num2 = readLine()!!.toDouble()
    }

    var res = (num1 + num2) / 2

    print("A média aritimetica de $num1 e $num2 é $res")
}

