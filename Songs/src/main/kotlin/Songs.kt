class Song(val title: String, val artist: String) { //class and its constructor in the same line

    fun play() { //functions as methods
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stoppped playing $title");
    }
}



fun main(args: Array<String>) {
    val songOne = Song(title = "The Mesopotamiams", artist = "They Might Be Giants"); //creating objects using the constructor
    val songTwo = Song(title = "Going Underground", artist = "The Jam");
    val songThree = Song(title = "Make me Smile", artist = "Steve Harley")  //NAMED PARAMETERS TO AVOID MAGICAL NUMBERS OR MAGICAL STRINGS

    songTwo.play();
    songTwo.stop();
    songThree.play();
}