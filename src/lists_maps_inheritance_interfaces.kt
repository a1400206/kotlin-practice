// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html
package demo

fun main(args : Array<String>) {
    // MutableList is a generic ordered collection of elements that supports adding and removing elements.
    var list1 : MutableList<Int> = mutableListOf(1,2,3,4,5)

    list1.add(6)
    println("1st : ${list1.first()}")
    println("1st : ${list1.last()}")
    println("1st : ${list1[2]}")

    var list3 = list1.subList(0,3)
    println("Length : ${list1.size}")
    list3.clear()

    list1.remove(1)
    list1.removeAt(1)
    list1.forEach { n -> println("Mutable list : $n") }

    // MutableMaps
    val map = mutableMapOf<Int, Any?>()
    val map2 = mutableMapOf(1 to "Juhinho", 2 to 25)

    map[1] = "Kaapo"
    map[2] = 69
    println("Map size : ${map.size}")
    map.put(3, "Helsinki")
    map.remove(2)

    for ((x, y) in map) {
        println("Key : $x Value : $y")
    }

    // Two class and inheritance examples used outside main fun
    val bowser = Animal("Bowser", 350.0, 269.5)
    bowser.getInfo()
    val paavo = Dog("Paavo", 20.0, 14.5, "El Juhinho")
    paavo.getInfo()

    val tweety = Bird("Tweetie", true)
    tweety.fly(10.0)
}

// Info about open classes here https://stackoverflow.com/questions/49076121/what-is-open-keyword-for-fields-in-kotlin/49076147
// Open classes can be overwritten
open class Animal(val name: String,
                  var height: Double,
                  var weight: Double) {
    // init: objects are initialized here and where we verify if a value is ok or not
    // we use regex here to check for numbers
    init {
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) {"Animal name cant contain numbers!"}
        require(height > 0) {"Height must be greater than 0"}
        require(weight > 0) {"Weight must be greater than 0"}
    }

    open fun getInfo(): Unit {
        println("$name is $height cm tall and $weight kg fat. Damn thats one fat fella lemme tell ya")
    }
}

// Example of inheritance
class Dog(name: String,
          height: Double,
          weight: Double,
          var owner: String): Animal(name, height, weight) {
    override fun getInfo(): Unit {
        println("$name is $height cm tall and $weight kg fat. Damn thats one fat dawg lemme tell ya, " +
                "its owner $owner should do something about it.")
    }
}

// Interfaces - like classes, but cant store state
interface Flyable {
    var flies: Boolean
    fun fly(distMile: Double): Unit
}

class Bird constructor(val name: String, override var flies: Boolean = true) : Flyable {
    override fun fly(distMile: Double): Unit {
        if (flies) {
            println("$name flies $distMile miles")
        }
    }
}