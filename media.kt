import javax.print.attribute.standard.Media

fun main() {
    print("Digite a 1° nota do aluno: ")
    val n1 = readLine()!!.toDouble()

    print("Digite a 2° nota do aluno: ")
    val n2 = readLine()!!.toDouble()

    print("Digite a 3° nota do aluno: ")
    val n3 = readLine()!!.toDouble()

    print("Digite a 4° nota do aluno: ")
    val n4 = readLine()!!.toDouble()

    var media = (n1 + n2 + n3 + n4)/4

    when{
        media <= 5 -> print("Nota: $media \n Aluno Reprovado")
        else -> print("Nota: $media \n Aluno Aprovado")
    }

}
