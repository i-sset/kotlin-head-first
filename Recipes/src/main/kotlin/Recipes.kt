data class Recipe(val title: String, val isVegetarian: Boolean) //data class are defined by the data keyword
//this override the equals method to compare objects of this class based on properties instead of the reference that they point to.
//data class are used to hold data
{
    var mainIngredient = "" //this field is not used in the generated functions that the data keyword adds to the class.
    //only fields specified in the main constructor are used in the generated functions
}

fun main(args: Array<String>) {
    val r1 = Recipe("Thai Curry", false)
    val r2 = Recipe("Thai Curry", false)
    val r3 = r1.copy(title = "Chicken Bhuna") //copy method of data classes allow to create an object based on another changing the properties specified in the args of copy

    println("r1 hash code: ${r1.hashCode()}") //hashcode is also overriden automatically in a data class
    println("r2 hash code: ${r2.hashCode()}") //objects that have the same value of properties have the same hashcode
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 == r2? ${r1 == r2}") // == operator always call to equals method
    println("r1 === r2? ${r1 === r2}") // === operator always inspect if the variables references to the same object
    println("r1 == r3? ${r1 == r3}")
    val (title, vegetarian) = r1 //destructuring a data class.
    println("title is $title and vegetarian is $vegetarian")
}
