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

}