
//------------------------generics----------------------
fun main() {
    printAge(30)
    printAge("30")
}
// (T) that's generics
// if I use that I can use any data type
fun <T>printAge(age:T){
    println("your age is $age")
}

//----------------------Exception handling ------------------
//----------------------try and catch -----------------------

fun main() {
    sub(5,2)
    sub(5,0)
}

fun sub(num1:Int,num2:Int){
    try {
        println(num1 / num2)

    }catch (e:Exception){
        println("Error")
    }
}
// -----------------------lambda function ------------------------

fun main() {
    //lambda function
    // we write it like that
    val sum = {x:Int , y:Int -> println(x + y) }
    sum(5,4)
    // another way to write lambda function if it returns value
    // value + (the name of value) : (data type(Input)) -> the data type you will return it(Output) = {name of parameter -> the parameter we will return}
    val square : (Int) -> Int = {num -> num * num}
    println(square(5))
    //this lambda function takes two value
    val summ : (Int, Int) -> Int = {num1 , num2 ->num1 / num2}
    println(summ(20, 4))
}

//------------------------Higher order function -----------------------
fun main(){
    val add = {x:Int,y:Int -> x + y }
    val mul = {x:Int,y:Int -> x * y }

    operation(5,10,mul)
    operation(5,10,add)
}
                                           //Input    //output
fun operation(x:Int,y:Int , mathOperation : (Int ,Int) -> Int){
    println(mathOperation(x,y))
}
