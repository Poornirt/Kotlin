package Functions


fun appendStringLambda(append: (Int,Int)->Int){
    print(append(3,5))
}

fun appendString1(a:Int,b:Int):Int{
    return a+b
}


fun main(){
    appendStringLambda(::appendString1)
}