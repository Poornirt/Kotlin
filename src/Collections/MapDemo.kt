package Collections

fun main(){
    val mapValue= mapOf<Int,String>(1 to "ggg",2 to "fgdfgd",3 to "qqqq")
    println("${mapValue.keys}")
    println("${mapValue.values}")
    for (values in mapValue.entries){
        values.key.also(::print)
    }
}