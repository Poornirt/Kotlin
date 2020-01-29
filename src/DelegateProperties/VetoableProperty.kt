package DelegateProperties

import kotlin.properties.Delegates

class VetoableProperty {
    var vetoableProperty: String by Delegates.vetoable("Default"){
        property, oldValue, newValue ->
        newValue=="New value"
    }
}

fun main(){
    var veto=VetoableProperty()
    veto.vetoableProperty="New value"
    println(veto.vetoableProperty)
}