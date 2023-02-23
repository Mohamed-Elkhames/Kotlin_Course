@file:Suppress("UNUSED_EXPRESSION")
fun main(){
    println("What's your gender? ")
    val gender = readLine()!!.toString()
    if (gender == "Male"||gender == "male"){
        println("What's your career? ")
        val career = readLine()!!.toString()
        println("You are a $career")
    }else if (gender == "Female"||gender == "female"){
        println("How old are you? ")
        val age = readLine()!!.toInt()
        println("your age is $age years old")
    }
}

//-----------------------------------------------------------------------------------
// -------------------------------- second task -------------------------------------
//-----------------------------------------------------------------------------------
fun main(){
    // this program take three number from the user and return the max number and minimum number
    println("Enter three number ")
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    val z = readLine()!!.toInt()
    // save the three number in array
    val maxNumber = arrayOf(x,y,z).max()
    val minNumber = arrayOf(x,y,z).min()
    // print the maximum number
    println("Max Number is $maxNumber")
    // print the minimum number
    println("Min Number is $minNumber")
}


// ----------------------------------------------------------------------------------
// -----------------------------------third task ------------------------------------
// ----------------------------------------------------------------------------------
fun main(){
    // this program take three number from the user and sort them
    println("Enter three number ")
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    // save the three number in array then sort them
    val sortNumber = arrayOf(num1, num2 , num3).sorted()
    println(sortNumber)
}

// ----------------------------------------------------------------------------------
// -----------------------------------forth task ------------------------------------
// ----------------------------------------------------------------------------------

fun main(){
    swapNumber(25,55)
}
fun swapNumber(x:Int, y:Int){
    var x = x
    var y = y
    println("x is : $x")
    println("y ix : $y")
    println("after swaping")
    x = x + y
    y = x - y
    x = x - y
    println("x is : $x")
    println("y is : $y")
}
// ----------------------------------------------------------------------------------
// -----------------------------------fifth task ------------------------------------
// ----------------------------------------------------------------------------------

fun main() {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }
    var sum = 0
    for (number in array) {
        sum += number
    }
    println(sum)
}



