/* Tutorial from https://www.youtube.com/watch?v=H_oGi8uuDpA */

package demo

fun main(args : Array<String>) {
    println("Hello World!")

    val name = "Juho"
    var age = 42

    // Print to display the limits of data types
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE
    println("Biggest Int: " + bigInt)
    println("Smallest Int: $smallInt")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE
    println("Biggest Double: " + bigDouble)
    println("Smallest Double: $smallDouble")

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE
    println("Biggest Long: " + bigLong)
    println("Smallest Long: $smallLong")

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE
    println("Biggest Float: " + bigFloat)
    println("Smallest Float: $smallFloat")

    // See how the value is shortened from the value below in println()
    var dblNum1: Double = 1.11111111111111111111111111111
    var dblNum2: Double = 1.11111111111111111111111111111
    println("Sum : " + (dblNum1 + dblNum2))

    if (true is Boolean){
        print("true is boolean")
    }

    println("3.14 to Int : " + (3.14.toInt()))
    println("A to Int : " + ('A'.toInt()))
    println("65 to Char : " + 65.toChar())

    val longStr = """This is a long-ass striiiiiing"""

    var str1 = "Dogs are the best"
    var str2 = "Cats are the best"

    // Checks and info of strings
    println("String length : ${longStr.length}")
    println("String equals : ${str1.equals(str2)}")
    println("2nd index : ${str1[2]}")
    println("Index 2-7 : ${str1.subSequence(2, 8)}")
    println("Contains random : ${str1.contains("Dogs")}")
}