package lesson17

class Folder {

    var name: String = "Новая папка"
        get() = if (isSecret) {
            fileCount = 0
            "скрытая папка : количество файлов - $fileCount"
        } else {
            "$field : количество файлов - $fileCount"
        }

    var fileCount: Int = 0
    var isSecret: Boolean = false

}

fun main() {

    val newFolder = Folder()

    newFolder.fileCount = 10

    println(newFolder.name)

    newFolder.isSecret = true

    println(newFolder.name)

}
