package Collections

fun main(){
    val number=(0..15).toList()
    println(number.chunked(3){it.sum()})
}