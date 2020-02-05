package DelegationPattern

fun main() {
    var obj = NeedService(service = ServiceImpl())
    println(
        obj.nameOfService
    )
    var ser = ServiceImpl()
    println(
        ser.nameOfService
    )
    ser.proceduresInvolves(10)
}

interface Service {
    var nameOfService: String
    fun proceduresInvolves(noOfSteps: Int)
}

class ServiceImpl : Service {
    override var nameOfService: String = "Electrician"


    override fun proceduresInvolves(noOfSteps: Int) {
        println(noOfSteps)
    }
}

class NeedService(service:Service) : Service by service {
    override var nameOfService: String = "plumbing"
}