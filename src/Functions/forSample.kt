package Functions

fun main() {
    val items = listOf("sfs", "sfa", "fdassd")
    for (item in items) {
        println(item)
    }
    println("while loop")
    var index = 0
    while (index < items.size) {
        println("$index is ${items[index]}")
        index++
    }
}