package Functions

open class OverrideSample{
    open fun occupation(){}
    fun role(){}   //final
}

class extendedClass: OverrideSample() {
    override fun occupation(){}
    //fun role(){}   // cannot override as this function is not declared open
}