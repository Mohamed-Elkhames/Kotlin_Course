fun main(){
    var s1 = Student(123,21,"mohamed",4.4)
    s1.info()
    val t1 = Teacher(1646, 32,"Ahmed",1200.20)
    t1.info()
}
open class User(var id:Int, var age:Int, var name:String){
    open fun info(){
        println("your ID for your jop is $id")
    }
}

class Student( id:Int,  age:Int,  name:String , var GBA:Double):User(id,age,name){
    override fun info(){
        println("your ID for your jop is $id")
        println("yor GBA is  $GBA")

    }
}
class Teacher(id:Int,  age:Int,  name:String,var Salary:Double):User(id,age,name){

}
