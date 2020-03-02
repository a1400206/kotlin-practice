/* Tutorial from https://www.youtube.com/watch?v=H_oGi8uuDpA */

package demo

fun main(args : Array<String>) {

    // Different ways to create arrays
    var sqArray = Array(5, { x -> x * x })
    println(sqArray[2])
    var arr2: Array<Int> = arrayOf(1, 2, 3)
    val oneTo10 = 1..10
    val alpha = "A".."Z"
    println("R in Alpha : ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)
    val twoTo20 = 2.rangeTo(20)
    val rng3 = oneTo10.step(3)

    for (x in tenTo1.reversed()) println("Reverse : $x")
    for (x in twoTo20) println("twoTo20 : $x")
    for (x in rng3) println("rng3 : $x")



}