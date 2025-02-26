fun main(){
    print("Digite um Número: ")
    val n1 = readLine()!!.toDouble()

    print("Digite um Número: ")
    var n2 = readLine()!!.toDouble()

    while (n2 <=0){
        print("Digite um Número que seja maior que 0: ")
        n2 = readLine()!!.toDouble()
    }
    val res = n1 / n2
    print("$n1 / $n2 = $res")
}