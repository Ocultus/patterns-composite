class Song(val author: String, val title: String, var speed: Double = 1.0) : IMusic {
    override fun play() {
        println("▶---$author---\n $title")
    }

    override fun changeSpeed(speed: Double) {
        println("Current speed:$speed")
        this.speed = speed
    }

    override fun like() {
        println("Song $title ♥")
    }

    override fun dislike() {
        println("Song $title ♡")
    }

    override fun getText(): String {
        return if(title == "Space Oddity"){
            "$title - https://genius.com/David-bowie-space-oddity-lyrics"
        } else {
            "$title - Text not found"
        }
    }

}