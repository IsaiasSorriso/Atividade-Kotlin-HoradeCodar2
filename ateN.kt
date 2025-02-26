fun main(){
    print("Digite um numero para fazer a contagem: ")
    val num = readLine()!!.toInt()
    var i = 0
    for (i in 0..num)
        print("$i \n")
        i++
}