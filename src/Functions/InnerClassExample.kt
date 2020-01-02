package Functions

open class InnerClassExample{
   open fun element(q:Int){
        "print the element".also(::println)
    }
}
class InnerClass:InnerClassExample(){
    override fun element(q:Int){
        "print the element $q".also(::println)
    }
    inner class Filler{
        fun printElement(){
            super@InnerClass.element(4)
        }
    }
}
fun main(){
    InnerClass().Filler().printElement()
}