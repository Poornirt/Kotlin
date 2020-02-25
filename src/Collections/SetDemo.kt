package Collections

fun main(){
    val setValue= setOf<Any>("qqq",2,11,"dfs")
    val setValue1= setOf<String>("#R","332","dsdg","gsdg")
    print(setValue.size)
    print(setValue1.size)
    print("${setValue==setValue1}")
}