package DelegateProperties

    val lazyProperty:String by lazy {
        "Poorni"
    }

    fun main(){
        println(lazyProperty)
        println(lazyProperty)
    }
