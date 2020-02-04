package ExtensionFunctions

import kotlin.properties.Delegates

class ExtensionFunction {

    val str:String by lazy {
        "avdd"
    }

    var demo:String by Delegates.observable("Initial Value"){
        property, oldValue, newValue ->
            "$property".also(::println)
             "$oldValue".also(::println)
    }

    fun test():String{
        var funString:String="abc"
        return funString
    }
    //Extension Function
    fun ExtensionFunction.addFeature(){
        
    }
}

fun main(){
    var extensionFunction=ExtensionFunction()
    println(extensionFunction.str)
    println(extensionFunction.demo)

}