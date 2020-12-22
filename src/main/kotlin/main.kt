fun main() {
    val album = Album("ChangesOneBowie",
        listOf(Song("David Bowie", "Space Oddity"),
            Song("David Bowie", "John, I'm Only Dancing")))

    album.play()
    album.like()
    album.dislike()
    album.changeSpeed(1.5)
    println(album.getText())
}