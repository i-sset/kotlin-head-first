class Wolf {
    var hunger = 10
    val food = "meat"

    fun eat() {
        println("The wolf is eating $food")
    }
}

class MyWolf {
    var wolf: Wolf? = Wolf() //the creation of a nullable type. null values are not allowed by default.

    fun myFunction() {
        wolf?.eat() //if wolf instance is not null, call the eat method
    }

}

fun getAlphaWolf(): Wolf? { //returning a nullable type
    return Wolf()
}

fun main(args: Array<String>) {
    var w: Wolf? = Wolf()

    if (w != null) { //normal way to check null values before acceding to a variable.
        w.eat()
    }

    var x = w?.hunger //conditional access to a property
    println("The value of x is $x")

    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8 //chaining of conditional access
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi", "Hello", null) //compiler infers the creation of an array of type String?
    for (item in myArray) {
        item?.let { //run code if a property is not null with the keyword let and a block of code
            println(it)
        }
    }

    getAlphaWolf()?.let {
        it.eat() //it represents the object
    }

    w = null
    //var z = w!!.hunger //this code throws a NullPointerException as w is null
}