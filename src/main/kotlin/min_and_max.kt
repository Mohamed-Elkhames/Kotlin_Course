fun main(){
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()

    if (num1 >= num2 && num1 >= num3){
        if (num2 >= num3){
            println("the min number is $num3")
        }else{
            println("the nin number is $num2")
        }
        println("the max number is $num1")
    }else if (num2 >= num1 && num2 >=num3){
        if (num1 >= num3){
            println("the min number $num3")
        }else{
            println("the min number $num1")
        }
        println("the max number is $num2")
    }else{
        if (num2 >= num1){
            println("the min number $num1")
        }else{
            println("the min number $num2")
        }
        println("the max number is $num3")
    }
}
