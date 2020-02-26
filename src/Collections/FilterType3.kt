package Collections

fun main() {
    val numbers = listOf(null, 1, "two", 3.0, null, "four", 345.34, 43.3, null)
    val filteringInstance = numbers.filterIsInstance<Double>().forEach {
        println(it.toString())
    }

    println("Not null")
    val filteringNotNull = numbers.filterNotNull().forEach {
        println(it)
    }

}