package demo

// Without data class
//class Laptop (val brand:String, val price:Int)
//{
//    fun show()
//    {
//        println("Awesome Machine...")
//    }
//}
//
//fun main(args: Array<String>)
//{
//    var lap1 = Laptop("Dell", 2000)
////  var lap2 = Laptop("Apple", 2000)
//    var lap2 = Laptop("Dell", 2000)
//
////     println(lap1 == lap2)
//
//    println(lap1.equals(lap2))
//
//}


// Data classes main purpose is to hold data and to give a bunch of useful methods to the class,
// like equals/hashCode and toString
data class Laptop (val brand:String, val price:Int) {
    fun show() {
        println("Awesome Machine!")
    }
}

data class Person(val name: String, val age: Int)


fun main(args: Array<String>) {
    var lap1 = Laptop("Dell", 2000)
    var lap2 = Laptop("Dell", 2000)
    var lap3 = lap1.copy(price = 2200);
    println(lap1.equals(lap2))
    println(lap3)

    fun getPeople(): List<Person> {
        return listOf(Person("Alice", 29), Person("Bob", 31))
    }
    println("People : ${getPeople()}")
}