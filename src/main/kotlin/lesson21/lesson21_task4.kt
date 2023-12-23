package lesson21

import java.io.File

fun File.appendNewWord(word: String) {

    val readText = readText()
    writeText("$word\n".lowercase())
    appendText(readText)

}

fun main() {

    val newFile = File("newFile.txt")

    newFile.appendText("dog собака\n")
    newFile.appendText("cat кошка\n")

    newFile.appendNewWord("Ship корабль")

}