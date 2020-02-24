package Functions

class ContravarianceExample<in T>(value: T) {
    private var args: T = value
    fun returnValue(t: T) {
        print(t)
    }
}

fun main() {
    var a: CovarianceExample<Int>
    var b = CovarianceExample<Any>(3)
    a = b as CovarianceExample<Int>
}