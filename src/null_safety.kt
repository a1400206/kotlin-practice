// https://kotlinlang.org/docs/reference/null-safety.html
package demo

fun main(args : Array<String>) {

    // Null safety is built into kotlin and so by default, you cannot assign null
    // For example, this gives error:
    // var nullValue: String = null -> Error, null cannot be assigned
    // To overcome this, we can use the question mark, which makes null a plausible value
    // Like so:
    var nullVal: String? = null

    // Can be applied to functions as well
    fun returnNull(): String? {
        return null
    }
    var nullVal2 = returnNull()

    // Force operator example ( !! ), first Kotlin smart cast way and then with force
    if (nullVal2 != null) {
        println(nullVal2.length)
    }
    // Notice force operator !!
    var nullVal3 = nullVal2!!.length

    val b: String? = null
    // Elvis operator
    // When we have a nullable reference r, we can say "if r is not null, use it, otherwise use some non-null value x"
    val l: Int = if (b != null) b.length else -1
    // Along with the complete if-expression, this can be expressed with the Elvis operator, written ?:
    val i = b?.length ?: -1
    // If the expression to the left of ?: is NOT NULL, the elvis operator returns it, otherwise it returns the expression to the right.
    // Note that the right-hand side expression is evaluated ONLY if the left-hand side is null.
    var nullVal4: String = returnNull() ?: "No Name"

}