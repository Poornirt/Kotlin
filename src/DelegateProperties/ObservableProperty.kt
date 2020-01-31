package DelegateProperties

import kotlin.properties.Delegates

var observableName: String by Delegates.observable("Default value"){
    property, oldValue, newValue ->
        println("$property Old value -> $oldValue New Value $newValue " )
}

fun main(){
    observableName = "first value"
    observableName = "second value"
}

    