class Dog(val name: String,
            weight_param: Int,
            breed_param: String) { //Kotlin creates a property for parameters that starts with val or val. weight_param is not a property... just a param

    init {
        print("Dog $name has been created. "); //initialization block. same as Java
    }

    var activities = arrayOf("Walks");
    val breed = breed_param.toUpperCase();

    init {
        println("The breed is $breed.") //second initialization block. the run order is given by the order in their appearance
    }

    var weight = weight_param
        set (value) { //setter method must be written in the next line of the property that owns the mutator.
            if (value > 0) field = value //if statements that only have one instruction can be written in the same line
        }

    val weightInKgs: Double
        get() = weight / 2.2; //inline get method

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main(args: Array<String>) {
    val myDog = Dog("Fido", 70, "Mixed");
    myDog.bark();
    myDog.weight = 75;
    println("Weight In Kgs is ${myDog.weightInKgs}");
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee");

    for (item in myDog.activities) {
        println("My dog enjoys $item");
    }

    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"), Dog("Ripper", 10, "Foodle"));
    dogs[1].bark();
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}