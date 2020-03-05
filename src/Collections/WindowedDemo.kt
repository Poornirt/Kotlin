package Collections

fun main(){
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.windowed(3,step = 2,partialWindows = true))
}