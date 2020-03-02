package demo

fun main(args : Array<String>) {

    // Higher order functions
    // From the kotlin site:
    // In the code below, the parameter combine has a function type (R, T) -> R,
    // so it accepts a function that takes two arguments of types R and T and returns a value of type R.
    // It is invoked inside the for-loop, and the return value is then assigned to accumulator.
    fun <T, R> Collection<T>.fold(initial: R, combine: (acc: R, nextElement: T) -> R): R {
        var accumulator: R = initial
        for (element: T in this) {
            accumulator = combine(accumulator, element)
        }
        return accumulator
    }
    val items = listOf(1, 2, 3, 4, 5)

    // Notice the lambdas here, when a lambda has paramameters, like acc: Int, i: Int ->, params go first and then the ->
    // Here we pass to Collection<T>.fold the parameters.
    items.fold(0, { acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")

        // THE LAST EXPRESSION IN LAMBDA IS CONSIDERED A RETURN VALUE!
        result
    })
    // Parameter types in a lambda are optional if they can be inferred:
    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })
    println("joinedToString: $joinedToString")
    // Function references can also be used for higher-order function calls:
    val product = items.fold(1, Int::times)
    println("product: $product")

    // Examples from the video https://www.youtube.com/watch?v=H_oGi8uuDpA
    // Basic example
    val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }

    // Example with outside fun
    val mult3 = makeMathFunc(3)
    println("5 * 3 = ${mult3(5)}")

    val multiply2 = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2, multiply2)
}
// Function that creates a function!
fun makeMathFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}

fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
    for(num in numList) {
        println("mathOnList ${myFunc(num)}")
    }
}