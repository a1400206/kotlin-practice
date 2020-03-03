package demo

import java.lang.IllegalArgumentException

fun main(args : Array<String>) {

    val divisor = 2 // Change to 0 see the error handling

    try {
        if (divisor == 0 ) {
            throw IllegalArgumentException("Cant throw divide by zero")
        } else {
            println("5 / $divisor = ${5/divisor}")
        }
    } catch(e: IllegalArgumentException) {
        println("${e.message}")
    }

    // We can also use Elvis operator ?:
    val person = object {
        var name: String? = "Ronaldinho Gaucho"
        var profession: String? = "Footballer"
        var number: Int = 10
    }
    val s = person.name ?: throw IllegalArgumentException("Name required")

    // The type of the throw expression is the special type Nothing.
    // The type has no values and is used to mark code locations that can never be reached.
    // In your own code, you can use Nothing to mark a function that never returns:
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
}

