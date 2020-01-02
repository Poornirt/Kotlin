package Functions

interface language{
    open val no_of_language:Int
}

class overridingLanguage:language{
    override val no_of_language: Int = 10
    fun printLanguage(){
        "$no_of_language".also(::println)
    }
}

class overridingInConstructor(override val no_of_language: Int):language{
    init {
        "$no_of_language".also(::println)
    }
}

fun main(){
    overridingLanguage().printLanguage()
    overridingInConstructor(2)
}

