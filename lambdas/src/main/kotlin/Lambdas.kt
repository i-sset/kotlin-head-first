fun main(args: Array<String>) {

    var addFive: (Int) -> Int = { x: Int -> x + 5} //lambda expression assigned to a variable. this lambda has a type of (Int) -> Int
    println("Pass 6 to addFive: ${addFive.invoke(6)}") //invoke is a function that all lambdas have.

    val addInts = {x: Int, y: Int -> x + y} // lambad with its type infered by the compiler
    val result = addInts(6, 7)  //this is another way to invoke the lambda.... just like another function
    println("Pass 6,7 to addInts, ${addInts(6, 7)}")

    val intLambda: (Int, Int) -> Int = {x, y -> x * y}
    println("Pass 10, 11 to intLambda, ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = { it + 7} //it keyword usage is valid when only one parameter is expected and the type of that parameter can be infered.
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: () -> Unit = { println("Hello")}
    myLambda.invoke()

    convert(20.0) { it * 1.8 + 32 } // lambdas that are given to a function as the last parameter must be put outside of parenthesis.

}



fun convert(x: Double, converter: (Double) -> Double): Double { //lambda as a parameter. functions that receives lambdas are called high-order functions.
    val result = converter(x);
    println("$x is converted to $result")
    return 2.1;

}