package Functions

class GenericsExample<T>(sample:T) {
    init {
        print(sample)
    }
}
fun main(){
    GenericsExample("string")
//    GenericsExample(34) cannot be sent as it accepts string
    GenericsExample(34) //Generics accepts any data type

    val ref1:GenericsExample<Int> = GenericsExample(22)
}