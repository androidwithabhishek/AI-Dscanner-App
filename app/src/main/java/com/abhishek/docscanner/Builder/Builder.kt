package com.abhishek.docscanner.Builder

data class Car(val brand: String,val color: String)



val list = listOf("Apple", "Banana", "Cherry")

// Output: [Apple, Banana, Cherry]

class CarBuilder(){

    var brand: String = ""
    var color: String = ""


    fun build(): Car{
        return Car(brand,color)

    }
}

fun main(){
    val car = CarBuilder().apply {
        brand = "tesla"
        color = "clack"
    }.build()

    println(car.toString())
    println(list) // Output: [Apple, Banana, Cherry]
}