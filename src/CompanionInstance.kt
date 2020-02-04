class CompanionInstance {

    private constructor() {
    }

    companion object {
        var instance: CompanionInstance? =null

        val myInstance: CompanionInstance
            get() {
                if (instance == null) {
                    instance = CompanionInstance()
                }

                return instance as CompanionInstance
            }
    }

    fun someMethod(variableName: String): Boolean {
        println("Not companion "+variableName)
        return true;
    }
}
fun main(){
    CompanionInstance.myInstance.someMethod("call")
}