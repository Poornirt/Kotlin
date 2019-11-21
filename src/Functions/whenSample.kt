package Functions

fun returnValue(obj:Any):String=when(obj){
    32 -> "thirty two"

    else -> "Nothing"
}

fun main(){
   println(returnValue(32))
    println(returnValue(313))
}