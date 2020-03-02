// https://kotlinlang.org/docs/reference/collections-overview.html
package demo

fun main(args : Array<String>) {

    // Collection operators can be used to get data out of them
    val numList2 = 1..20

    // Sum values together
    val listSum = numList2.reduce { x, y -> x + y }
    println("Reduce Sum : $listSum")

    // Like reduce but starts with an initial value
    val listSum2 = numList2.fold(5) { x, y -> x + y}
    println("Fold Sum : $listSum2")

    println("Evens : ${numList2.any { it % 2 == 0 }}") // true, because some numbers are dividable with 2
    println("Evens : ${numList2.all { it % 2 == 0 }}") // false, because not all numbers are even

    // get numbers that are smaller than 3 from the collection
    val big3 = numList2.filter { it < 3 }
    big3.forEach { n -> println("<3 : $n") }

    // create a map of numbers from the collection
    val times7 = numList2.map { it * 7 }
    times7.forEach { n -> println("*7 : $n") }
}