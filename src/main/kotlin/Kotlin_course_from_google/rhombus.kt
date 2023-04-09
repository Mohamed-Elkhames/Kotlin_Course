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

// this is triangle with stars 
fun main() {
    for(i in 1 ..5){
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces){
            print(" ")
        }
        // i * 2 - 1 will be 1 * 2 - 1 = 1 then 2 * 2 - 1 = 3 then 3 * 2 - 1 = 5  ...etc 
        val numberOfStars = i * 2 - 1 
        for(j in 1..numberOfStars){
            print("*")
        }
        println()
    }
}
// another triangle 
fun main() {
    for (i in 1..5){
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces){
            print(" ")
        }
        val numberOfStars = 11 - i * 2 // 11 - 1 * 2 = 9
        for (j in 1..numberOfStars){
            print("*")
        }
        println()

    }
}

// another tringle
fun main() {
for (i in 1 until 5) {
   val numberOfSpaces = 5 - i
for (j in 1..numberOfSpaces) {
   print(" ")
}
val numberOfStars = i
for (j in 1..numberOfStars) {
     print("*")
}
     println()
}
for (i in 1..5) {
val numberOfSpaces = i - 1
for (j in 1..numberOfSpaces) {
      print(" ")
}
val numberOfStars = 6 - i
for (j in 1..numberOfStars) {
     print("*")
}
     println()
}
}
