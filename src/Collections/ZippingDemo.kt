package Collections

fun main(){
    val list1= listOf<String>("qqq","eeee","ttt")
    val list2= listOf<String>("fdf","fhh","dfhdf")
    println(list2 zip list2)
    println(list1.zip(list2){list1,list2 -> "${list1}to zipped ${list2}"})
}