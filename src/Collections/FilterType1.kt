package Collections

fun main() {
    val typeOf = listOf("one", "five")
    val filtering = typeOf.filter { it.length>3 }
    println(filtering)

    val mapIOf = mapOf(1 to "name1",2 to "name2",3 to "name3")
    val filterMap=mapIOf.filter { (key,value) -> key.equals(1) || value.endsWith("3")  }
    println(filterMap)
}