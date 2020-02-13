package Functions

open class varargSample {
    companion object CallingInnerFunction {
        var instance: varargSample? = null
        val getInstance: varargSample
            get() {
                if (instance == null) {
                    instance = varargSample()
                }
                return instance as varargSample
            }
    }

    //if the varargs is not the last parameter then it has to be passed as named arguments

    open fun callThisFunction(test:String,vararg arrayoFObj: Any,test1:String="test") {
        for (arr in arrayoFObj){
            println(arr)
        }
    }


}

class B: varargSample() {
    override fun callThisFunction(test: String, vararg arrayoFObj: Any, test1: String) {
        println(test1)
        val list = arrayOf(1,2,3)
        testingSpreadOperator(*list)
    }

    fun testingSpreadOperator(vararg sample1:Any,sample2:Any=23){
        for(sample in sample1){
            print(sample)
        }
        println(sample2)
    }
}

fun main() {
    varargSample.getInstance.callThisFunction("ss",34,42,2,1,52,5,256)
    var b=B()
    b.callThisFunction("format", "test1","test2")
    //b.testingVarargs(arrayOf(2,3,2),"sss")
    //b.testingSpreadOperator(2,32,1,4)
}

