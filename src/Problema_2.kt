//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*
fun main() {
    //val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    //println("Hello, " + name + "!")

    //for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    println("Ingrese palabras separados por espacio:")
    val palabras = readLine()?.split(" ") ?: listOf()

    val palindromas = palabras.count { Pali(it) }
    val conDosVocalesDistintas = palabras.count { vocales(it) }
    val conConsonanteInicial = palabras.count { novocales(it) }

    println("Cantidad de palabras palíndromas: $palindromas")
    println("Cantidad de palabras con al menos 2 vocales distintas: $conDosVocalesDistintas")
    println("Cantidad de palabras que inician con consonante: $conConsonanteInicial")

}

fun Pali(palabra: String): Boolean {
    return palabra == palabra.reversed()

}

fun vocales(palabra: String): Boolean {
    val vocales = "aeiou"
    return palabra.toLowerCase().filter { it in vocales }.toSet().size >= 2
}

fun novocales(palabra:String): Boolean{
    val novocales ="qwrtypsdfghjklzxcvbnm"
    return palabra.isNotEmpty() && palabra[0].toLowerCase() in novocales
    
}




