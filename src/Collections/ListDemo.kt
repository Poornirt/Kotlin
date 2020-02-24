package Collections

class ListDemo {
    fun getListFromMain(string:Collection<String>){
        for(s in string){
            s.also(::print)
        }
    }
}

fun main(){
    val stringList= listOf<String>("sss","333","yyy")
    ListDemo().getListFromMain(stringList)
}