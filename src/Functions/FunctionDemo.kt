package Functions

    fun demo(a:Int,b:Int):Int{
        println("a is $a and b is $b")
        return a+b
    }

    fun main(){
        println("${demo(23,56)}")
    }
