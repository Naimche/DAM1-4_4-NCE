class Pila<T> {
    private var list = mutableListOf<T>()

    fun top() = list[0]
    fun push(element: T) = list.add(0, element)
    fun pop(): Boolean = list.remove(list[0])
    fun isEmpty(): Boolean = list.isEmpty()
    fun isNotEmpty(): Boolean = list.isNotEmpty()
}

fun <T> reverse(list: List<T>): List<T> {
    val pila = Pila<T>()
    val iterator = list.iterator()
    val listInverted = mutableListOf<T>()

    while (iterator.hasNext()) pila.push(iterator.next())

    while (pila.isNotEmpty()) {
        pila.top()?.let { listInverted.add(it) }
        pila.pop()
    }
    return listInverted
}

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val numbersRev = reverse(numbers)
    if (listOf("four", "three", "two", "one") != numbersRev)
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}