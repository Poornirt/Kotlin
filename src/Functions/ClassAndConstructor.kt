package Functions

class InitDemo constructor(arg1:String){
    val firstString="demo number one".also (::println)
    init {
        "The argument is $arg1".also (::println)
    }
    init {
        "Testing init block $arg1".also (::println)
    }

}
fun main(){
    InitDemo("Demo")
}