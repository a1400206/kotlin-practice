/* Tutorial from https://www.youtube.com/watch?v=H_oGi8uuDpA */

package demo

import java.util.Random

fun main(args : Array<String>) {

    // An example of the usual if() and when(), performing the same task
    val age = 8
    if(age <= 5){
        println("Go to Kindergarten")
    } else if ((age > 5) && (age <= 17)) {
        val grade = age - 5
        println("Go to grade $grade")
    } else {
        println("Go to Work!")
    }

    when(age){
        0,1,2,3,4 -> println("Go to Preschool")
        5 -> println("Go to Kindergarten")
        in 6..17 -> {
            val grade = age - 5
            println("Go to $grade")
        }
        else -> println("Go to College")
    }

    // Using imported Random() with while()
    for(x in 1..10) {
        println("Loop : $x")
    }
    val rand = Random()
    val magicNum = rand.nextInt(50) + 1
    var guess = 0
    while(magicNum != guess) {
        guess+= 1
    }
    println("Magic Number was $guess")

    for(x in 1..20){
        if (x % 2 == 0) {
            continue
        }
        println("Odd value : $x")
        if (x == 15) break
    }

    var arr3: Array<Int> = arrayOf(3,6,9)

    for (i in arr3.indices) {
        println("Mult 3 : ${arr3[i]}")
    }

    for ((index, value) in arr3.withIndex()) {
        println("Index : ${index} Value : ${value}")
    }

    // Functions
    fun add(num1:Int, num2:Int) : Int = num1 + num2
    println("5 + 4 = ${add(5,4)}")

    fun subtract(num1:Int=1, num2:Int=1) = num1 - num2
    println("5 - 4 = ${subtract(5,4)}")
    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")

    fun sayHello(name: String) : Unit = println("Hello $name")
    sayHello("Juho")

    val(two, three) = nextTwo(1)
    println("1 $two $three")
}
fun nextTwo(num: Int): Pair<Int, Int> {
    return Pair(num+1, num+2)
}