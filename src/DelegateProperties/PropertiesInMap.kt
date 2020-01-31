package DelegateProperties

class PropertiesInMap(Person:Map<String,Any>){
    val name:String by Person
    val id:Int by Person
}

class mutableMap(Employee:Map<String,String>){
    val name:String by Employee
    val favs:String by Employee
}

fun main(){
    val person=PropertiesInMap(mapOf("name" to "Poorni","id" to 27))
    "${person.name}".also(::println)
    "${person.id}".also(::println)

    val emp=mutableMap(mapOf("name" to "QQQ","favs" to "str"))
    "${emp.name}".also(::println)
    "${emp.favs}".also(::println)

}
