package demo

fun main(args : Array<String>) {
    // Object declaration
    val bike = BikeFactory.makeBike(20.0, "Citybike")
    println("There are ${BikeFactory.bikes.size} bike(s).")
    val bikes = BikeFactory.bikes
    bikes.forEach {n -> println("Model ${n.model} has top speed of ${n.maxSpeed}km/h")}

    val car = Car.makeCar(150)
    println("There are ${Car.Factory.cars.size} car(s).")

    // Object expressions
    start(object : VehicleFunction {
        override fun drive() = "Driving really fast"
    })
}
// Object declaration
object BikeFactory {
    val bikes = mutableListOf<Bike>()
    fun makeBike(maxSpeed: Double, model: String): Bike {
        val bike = Bike(maxSpeed, model)
        bikes.add(bike)
        return bike
    }
}
open class Vehicle (
    val maxSpeed: Double,
    val horsepower: Int
)
class Bike (
    maxSpeed: Double,
    val model: String
) : Vehicle(maxSpeed, 20)

// Companion object
class Car(val horsepowers: Int) {
    companion object Factory {
        val cars = mutableListOf<Car>()
        fun makeCar(horsepowers: Int): Car {
            val car = Car(horsepowers)
            cars.add(car)
            return car
        }
    }
}

// Object expressions
interface VehicleFunction {
    fun drive(): String
}
fun start(vehicle: VehicleFunction) = println(vehicle.drive())
