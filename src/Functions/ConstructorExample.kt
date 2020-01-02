package Functions

open class ConstructorExample(name: String){
    init {
        "testing also here".also(::println)
    }
}

class derivedClass(val name:String): ConstructorExample(name.capitalize().also{ println("$it") }){

}