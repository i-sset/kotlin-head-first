open class Animal { //open keywords tell explicitly that this class is ok to be a superclass
    open val image = ""; //open keyword on fields tells that this field can be overrided
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The animal is making noise")
    }

    open fun eat() {
        println("The animal is eating")
    }

    open fun roam() {
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

open class Canine : Animal() {
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
}