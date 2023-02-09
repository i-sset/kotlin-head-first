interface Roamable {
    fun roam()
}

//implementing an interface is the same way as inherit from a super class. The difference is the usage of parenthesis because Interfaces does not have
// constructors
abstract class Animal : Roamable { //open keywords tell explicitly that this class is ok to be a superclass. abstract keyword make the class un-instantiable
    abstract val image: String //open keyword on fields tells that this field can be overrided. abstract fields require the type of the variable
    abstract val food: String //abstract fields do not need an initial value. the value is given by a concrete class
    abstract val habitat: String //abstract keyword have the functionality of the open keyword
    var hunger = 10

    abstract fun makeNoise()
    abstract fun eat()
    override fun roam() {
        println("The animal is roaming")
    }
    fun sleep() {
        println("The animal is sleeping")
    }
}

class Hippo: Animal() { //colon symbol is used to inherit from a superclass. the constructor of the class is called

    override val image = "hippo.jpg" //override keyword actually overrides a field from the superclass that was opened
    override val food = "grass"
    override val habitat = "water" //override can change variables declared with val to var but not the other way

    override fun makeNoise() {
        println("Grunt Grunt")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }


}

abstract class Canine : Animal() {
    override fun roam() {
        println("The canine is romaing");
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}


class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

class Vehicle : Roamable {
    override fun roam() {
        println("The vehicle is roaming")
    }
}


fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(), Wolf());
    for (animal in animals) {
        animal.roam()
        animal.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) { //is operator checks if the object in the left side is a type or subtype of the type in the right
            item.eat()
        }
    }
}