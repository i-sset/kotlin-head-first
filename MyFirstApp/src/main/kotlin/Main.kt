fun main(args: Array<String>) {
    var x = 3;  //var is used to create variables
    val name = "Josset"; // val is used to create constants
    x = x * 10;

    println("x is $x.");

    while (x > 20) { //simple while loop
        x = x - 1;
        print("x is now $x.");
    }
    println()
    for (i in 1..10) { //i is not declared using var or val. the sintax n..m is used to create a range. this loop 10 times
        x = x + 1;
        print(" x is now $x");
    }

    if (x == 20) { //simple if condition
        println("x must be 20");
    } else {
        println("x isn't 20");
    }

    if (name.equals("Josset")) {
        println("$name Strike");
    }

    println(if (x > 1) "x is greather than 1" else "x is not greater than 1"); //usage of IF to return a value. this way needs to declare an else always
}