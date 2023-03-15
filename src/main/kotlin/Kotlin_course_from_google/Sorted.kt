fun main(){
    print("enter first number: ")
    val num1 = readLine()!!.toInt()
    print("enter second number: ")
    val num2 = readLine()!!.toInt()
    print("enter third number: ")
    val num3 = readLine()!!.toInt()

    val smallest:Int
    val middle:Int
    val largest:Int
    // if num1 is the smallest number
    if (num1 <=num2 && num1 <= num3){
        smallest = num1
        if (num2 <= num3){
            middle = num2
            largest = num3
        }else{
            middle = num3
            largest = num2
        }
    // if num2 is the smallest number
    }else if (num2 <= num1 && num2 <= num3){
        smallest = num2
        if (num1 <= num3){
            middle = num1
            largest = num3
        }else{
            middle = num3
            largest = num1
        }
    // if num3 is the smallest number    
    }else {
        smallest = num3
        if (num1 <= num2){
            middle = num1
            largest = num2
        }else {
            middle = num2
            largest = num1
        }
    }
    // print the number
    println("sorted number is $smallest , $middle , $largest")
}
