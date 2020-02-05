typealias mutableListForTest = MutableList<Int>
fun method(): mutableListForTest {
    var mutableList = mutableListOf<Int>(3, 5, 2, 1, 6, 1)
    for (mutableList in mutableList) {
        print(mutableListOf(mutableList))
    }
    return mutableList
}

fun method1(mutableList: mutableListForTest){
    print(mutableList)
}

fun main() {
    method()
    method1(mutableListOf(9,5,3,1))
}