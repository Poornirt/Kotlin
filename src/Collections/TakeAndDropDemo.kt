package Collections

fun main(){
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.takeLast(3))
    println(numbers.take(4))
    println(numbers.drop(2))
    println(numbers.dropLast(3))
}