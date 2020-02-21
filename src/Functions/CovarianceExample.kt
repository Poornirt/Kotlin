package Functions

class CovarianceExample<out T>(args: T) {
    private var t: T = args
    fun get(): T {
        return t
    }
}

fun main() {
    var a = CovarianceExample<Int>(1)
    var b: CovarianceExample<Any>
    b = a
}