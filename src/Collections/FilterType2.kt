package Collections

fun main() {
    val listDemo = listOf("sd", "dsfs", "fsaf")
    val filtering = listDemo.filterIndexed { index: Int, s: String -> index > 1 || s.length == 2 }
    println(filtering)

    val filterinfNot=listDemo.filterNot { it.length>2 }
    println(filterinfNot)
}