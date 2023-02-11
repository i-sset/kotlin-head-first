data class Recipe(var name: String)

fun main(args: Array<String>) {
    var shoppingList = mutableListOf("Tea", "Eggs", "Milk") //creation of a list that can change, re-size and sortable
    println("shoppingList original: $shoppingList")

    val extraShopping = listOf("Cookies, Sugar", "Eggs")
    shoppingList.addAll(extraShopping)
    println("shoppingList items added: $shoppingList")

    if (shoppingList.contains("Tea")) {
        shoppingList.set(shoppingList.indexOf("Tea"), "Coffee")
    }

    shoppingList.sort()
    println("ShoppingList sorted: $shoppingList")
    shoppingList.reverse()
    println("ShoppingList reversed: $shoppingList")


    val shoppingSet = shoppingList.toMutableSet()
    println("shoppingSet: $shoppingSet")

    val moreShopping = setOf("Chives", "Spinach", "Milk")
    shoppingSet.addAll(moreShopping)
    println("shoppingSet items added: $shoppingSet")

    shoppingList = shoppingSet.toMutableList()
    println("shoppingList new version: $shoppingList")



    var r1 = Recipe("Chicken Soup")
    var r2 = Recipe("Quinoa Salad")
    var r3 = Recipe("Thai Curry")
    var r4 = Recipe("Jambalaya")
    var r5 = Recipe("Sausage Rolls")
    val recipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("recipeMap original: $recipeMap")

    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    recipeMap.putAll(recipesToAdd)
    println("recipeMap updated: $recipeMap")

    if (recipeMap.containsKey("Recipe1")) {
        println("Recipe1 is ${recipeMap.getValue("Recipe1")}")
    }
}