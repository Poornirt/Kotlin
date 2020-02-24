package Collections

data class Employee(var name:String,var age:Int)

fun main(){
    var personList= listOf<Employee>(Employee("poorni",24), Employee("qqqq",33))
    print(personList)
}