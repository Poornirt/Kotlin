package Functions

fun main() {
    divNumber(2, 5)
    divNumber(534, 41)
    divNumber(23, 421)
    divNumber(0, 32)
}

fun divNumber(arg1: Int, arg2: Int) {
    if (arg1 != 0 && arg2 != 0)
        println(arg1 / arg2)
}