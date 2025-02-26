fun main() {
    print("Deseja Calcaular a nota do Aluno? \n Digite 'S' pra Confirmar: ")
    var confirma = readLine()!!.toString()
    var quant = 0
    while (confirma == "S"){
        print("Nome do Aluno: ")
        val nome = readLine()!!.toString()

        print("Nota de matematica: ")
        val nt1 = readLine()!!.toDouble()

        print("Nota de Portugues: ")
        val nt2 = readLine()!!.toDouble()

        var res = (nt1 + nt2) / 2

        if (res > 6){
            print("$nome Aprovado\n")
            quant++
        }
        else
            print("$nome Reprovado\n")

        print("Deseja Calcular a média de outro aluno? \n Digite 'S' pra confirmar ou 'N' pra sair: ")
        confirma = readLine()!!.toString()
    }
    print("Quantidade de Aprovados: $quant")
}
