package com.example.homework

fun main(){
    val herbivores1 = Herbivores("Олень")
    herbivores1.favouriteFood = "Сено"
    val herbivores2 = Herbivores("Гну")
    herbivores2.favouriteFood = "Трава"

    val predator1 = Predators("Тигр")
    predator1.favouriteFood = herbivores1
    val predator2 = Predators("Лев")
    predator2.favouriteFood = herbivores2

    val listOfHerbivores:List<Herbivores> = listOf(herbivores1, herbivores2)
    val listOfPredators:List<Predators> = listOf(predator1, predator2)

    for(index in listOfHerbivores.indices){
        println("Это животное ${listOfHerbivores[index].name} его любимая еда ${listOfHerbivores[index].favouriteFood}")
    }

    for(index in listOfPredators.indices){
        println("Это животное ${listOfPredators[index].name} его любимая еда ${listOfPredators[index].favouriteFood?.name}")

    }



}