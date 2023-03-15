//------------------------------------------------------
//-------------------scope function --------------------
//------------------------------------------------------
fun main() {
    // also function can make our code better and easy to write
    val worker = Worker().also {
        it.name = "Ahmed"
        it.salary= 5005
        // we can print here like that
        println(it.name)
        //return object
    }

    println(worker.name)
    println(worker.salary)
}
class Worker{
    var name:String = "Mohamed"
    var salary:Int = 4000
}


fun main() {
    val per = Person().apply {
        // we use this to change value
        this.name = "Mohamed"
        // we can write it without use this
        age = 25
        println(this.name)
        println(age)
        // return object
    }
}
class Person{
    var name:String = "Ahmed"
    var age:Int = 21
}
fun main() {
    // let skip the line of code if it has null error
    val name:String = "Mohamed"
    var result = name.let {
        println("the length ${it.length}")
        println("the reversed ${it.reversed()}")
        "done"
    }
    println(result)

}
