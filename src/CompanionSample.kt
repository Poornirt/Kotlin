class CompanionSample {
    companion object {
        fun call()= print("calling companion")
    }
}
fun main(){
    CompanionSample.call()
}