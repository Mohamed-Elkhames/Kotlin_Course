fun main(){
    val age = readLine()!!.toInt()
    if (age < 18){
        println("you are young")
    }else if (age > 18){
        println("you are adult")
    }else {
        println("you are die")
    }
    val x = readLine()!!.toInt()
    when(x){
        0 -> println("sign in")
        1 -> println("sign out")
        2 -> println("Exit")
        else -> println("Invalid")
    }
    val arr = IntArray(5)
    arr[0]= 1
    arr[1]= 2
    arr[2]= 3
    arr[3]= 4
    arr[4]= 5
    var result = 0
    for (i in arr){
        result+=i
    }

    println(result)

}