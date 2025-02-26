fun main(){
    val planets = arrayOf("Terra", "Venus", "Plutão", "Júpter", "Saturno", "Urano", "Mercúrio", "Marte")
    print("Escreva um Nome de uma Planeta do Sistema Solar: ")
    val planeta = readLine()!!.toString()

    if (planets.contains(planeta))
        print("$planeta está no Sistema Solar")
    else
        print("$planeta não está no Sistema Solar")
}