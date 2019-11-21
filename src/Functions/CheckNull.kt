package Functions

fun checkLength(obj:Any):Int?{
    if (obj is String)
    {
        return obj.length;
    }
    return null
}

fun main(){
    println("${checkLength("DemoFunction")}")
    println("${checkLength(2343534)}")
}