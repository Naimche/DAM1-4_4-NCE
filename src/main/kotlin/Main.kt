class Pila<T>() {
    var lista = mutableListOf<T>()
    fun top() = lista.first()
    fun push(t: T) = lista.add(0, t)
    fun pop() = lista.remove(lista.first())
    fun empty() = lista.isEmpty()

}

fun <T> reverse(listaNumeros: List<T>): List<T> {
    var pila = Pila<T>()
    var iterador = listaNumeros.iterator()
    var listaInvertida = mutableListOf<T>()

    while (iterador.hasNext()) {
        pila.push(iterador.next())
    }

    while (!pila.empty()) {
        pila.top().also { listaInvertida.add(it) }
        pila.pop()
    }


    return listaInvertida
}

fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)

}