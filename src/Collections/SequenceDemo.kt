package Collections

data class SequenceDemo(val name: String, val age: Int)

val emp = listOf<SequenceDemo>(
    SequenceDemo("qqq", 1), SequenceDemo("rrr", 2), SequenceDemo("yyy", 3),
    SequenceDemo("ooo", 4), SequenceDemo("nnn", 5))

val seq= emp.asSequence().filter { it.name.startsWith("q") || it.age.equals(3) }.map { it.name }.distinct().toList()

val generateSeq= generateSequence(0) { it+1  }.take(10).filter { it<5 }.toList()

fun main(){
    println(seq)
    println(generateSeq)
}

