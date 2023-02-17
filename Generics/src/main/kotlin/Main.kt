abstract class Pet(var name: String) {

}

class Dog(name: String) : Pet(name) {

}

class Cat(name: String) : Pet(name) {

}

class Fish(name: String) : Pet(name) {

}

class Contest<T: Pet>(var vet: Vet<in T>) { //generic class upper bound to Pet class. It says that T can only be of a Pet or a subtype of Pet.
    //in keyword make the generic type allow supertypes of T as valid values

    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {  //generic as a parameter type
        if (score >= 0 ) {
            scores.put(t, score)
        }
    }

    fun getWinners(): MutableSet<T> {
        val winners: MutableSet<T> = mutableSetOf()
        val highScore = scores.values.max()

        for ((pet, score) in scores) {
            if (score == highScore)
                winners.add(pet)
        }

        return winners
    }
}


interface Retailer<out T> { //out keywords make the generic type allow subtypes of T as valid values.
    fun sell(): T
}

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell cat")
        return Cat("")
    }
}

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell dog")
        return Dog("")
    }
}

class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell fish")
        return Fish("")
    }
}

class Vet<T: Pet> {
    fun treat(t: T) {
        println("Treat pet ${t.name}")
    }
}

fun main(args: Array<String>) {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny")




    val catVet = Vet<Cat>()
    val petVet = Vet<Pet>()

    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)

    val catContest = Contest<Cat>(catVet) //creation of an instance of a generic class
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println("cat contest winner is ${topCat.name}")

}
