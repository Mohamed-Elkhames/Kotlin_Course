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