fun main(args: Array<String>) {

    val options:Array<String> = arrayOf("Rock", "Paper", "Scissors");
    val gameChoice = getGameChoice(options);
    val userChoice = getUserChoice(options);
    printResult(gameChoice, userChoice)
}

fun getGameChoice(options: Array<String>): String {
    val choice = kotlin.random.Random.nextInt(0, options.size);
    return options[choice];
}

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false;
    var userChoice = "";

    while (!isValidChoice) {
        println("Please enter one of the following:");
        for (item in options) {
            print(" $item");
        }
        println(".");
        val userInput = readLine();
        if (userInput != null && userInput in options) {
            isValidChoice = true;
            userChoice = userInput;
        }

        if (!isValidChoice) println("You must enter a valid choice")
    }

    return userChoice;
}

fun printResult(gameChoice: String, userChoice: String) {
    var winner = "";
    var message = "Player choice: ${userChoice}; Game choice: ${gameChoice}";

    if (userChoice == gameChoice) {
        winner = "Tie";
    } else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) {
        winner = "You won!";
    } else {
        winner = "Game won";
    }

    println("$message. $winner");
}