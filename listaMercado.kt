fun main(){
    var lista = mutableListOf("Manga", "Laranja", "Pera", "Uva", "Tomate" )
    for (nome in lista){
        print("$nome \n")
    }

    while (true) {
        if (lista.isNotEmpty()) {
            print("Escreva o nome da fruta para remover da lista: \n")
            var fruta = readLine()!!.toString()

            if (lista.contains(fruta)) {
                lista.remove(fruta)
                print("$fruta Removida \n")
                print("Lista Autal: \n")
                for (nome in lista) {
                    print(" $nome \n")
                }
            } else
                print("$fruta Não Disponivel ")
        }
        else{
            print("Lista Vazia")
            break
        }
    }

}