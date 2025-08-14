package com.abhishek.docscanner.mapAndFlatMap

val numberList = listOf(4,8,6)


val squers = numberList.map {it ->

    it*it
}
val newList = mutableListOf<Int>()





fun main(){

newList.addAll(squers)


    val names = listOf("Abhishek", "Gupta")

    val lettersUsingMap = names.map { it.toList() }

    val lettersUsingFlatMap = names.flatMap { it.toList() }

    println(lettersUsingMap)
    println(lettersUsingFlatMap)



}