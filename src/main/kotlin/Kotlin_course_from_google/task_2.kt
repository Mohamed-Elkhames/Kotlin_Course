
// -------------------------------------------------------------------
// ------------------------------- task 1 ----------------------------
// -------------------------------------------------------------------
fun main(){
    val car1 = Car("Toyota", "module 5", 2023)
    val car2 = Car("Nissan", "module 2", 2022)
    println(car1.nameCar)
    println(car2.nameCar)
}

class Car(val brand:String,val module:String,val year:Int){
    val nameCar
        get()= "$brand $module $year"
}

// -------------------------------------------------------------------
// ------------------------------- task 2 ----------------------------
// -------------------------------------------------------------------
fun main(){
    val car1 = Car("Toyota","model ", 2015)
    val car2 = Car("Ford","model 2 ", 2020)
    val car3 = Car("Audi","model 5", 2023)
    val carList = listOf(car1,car2,car3)
    for (i in carList){
        println(i.carInfo)
    }
}

class Car constructor(val brand:String, val model:String, val year:Int){
    val carInfo
        get() = "$brand $model $year"
}

// -------------------------------------------------------------------
// ------------------------------- task 3 ----------------------------
// -------------------------------------------------------------------

fun main() {
    val account = BankAccount("Mohamed", "Mohamed@gmail.com", "ASd014725",
        21, "158749",5000.0)

    account.deposit(1000.0)
    account.withdraw(500.0)
    account.printBalance()
}
class BankAccount(val name: String,
                  val email: String,
                  val password: String,
                  val age: Int,
                  val userId: String,
                  var balance:Double) {

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Insufficient funds")
        } else {
            balance -= amount
        }
    }

    fun deposit(amount: Double) {
        balance += amount
    }

     fun getAccountBalance(): Double {
        return balance
    }

    fun printBalance() {
        println("Balance: $balance")
    }
}

// -------------------------------------------------------------------
// ------------------------------- task 4 ----------------------------
// -------------------------------------------------------------------

fun main(){
    val players = arrayListOf<FootballPlayer>(
        FootballPlayer(30,"Messi","Paris"),
        FootballPlayer(22, "abo treaka", "Al-ahly"),
        FootballPlayer(7 , "cristano", "Suiiiiiii")
    )
    for (player in players) {
        println("ID: ${player.id}, Name: ${player.name}, Team: ${player.team}")
    }
}
data class FootballPlayer(val id:Int, val name:String, val team:String)


// -------------------------------------------------------------------
// ------------------------------- task 5 ----------------------------
// -------------------------------------------------------------------
fun main(){
    val house1 = House(15, "paron House","red")
    val house2 = House(13, "Mohamed House","blue")
}

class House(val id:Int,val name:String,val color:String){
    init {
        println("name : $name , color : $color")
    }
}
