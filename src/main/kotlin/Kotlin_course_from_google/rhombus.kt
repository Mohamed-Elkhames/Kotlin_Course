fun main() {
    val width = 5
    for(i in 1 until width step 2 ){
        for (j in 1..width - i / 2 ){
            print(" ")
        }
        for(j in 1..i){
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2){
        for (j in 1..width - i / 2 ){
            print(" ")
        }
        for (j in 1..i){
            print("*")
        }
        println()
    }
}
