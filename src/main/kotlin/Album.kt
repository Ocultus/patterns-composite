    class Album(private val title: String, private val musicList: List<IMusic>, var speed: Double = 1.0 ): IMusic {
    override fun play() {
        musicList.forEach { it.play() }
    }

    override fun changeSpeed(speed: Double) {
        println("Current speed:$speed")
        this.speed = speed
    }

    override fun like() {
        println("Album $title ♥")
        musicList.forEach{ it.like() }
    }

    override fun dislike() {
        println("Album $title ♡")
        musicList.forEach{ it.dislike()}
    }

    override fun getText(): String {
        return musicList.joinToString(separator = "\n") { it.getText() }
    }
}