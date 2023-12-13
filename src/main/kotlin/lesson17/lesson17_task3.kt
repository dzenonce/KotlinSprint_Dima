package lesson17

class Folder(
    private val _name: String,
    var fileCount: Int,
    var isSecret: Boolean,
) {

    var name: String = _name
        get() = if (isSecret) {
            fileCount = 0
            "скрытая папка : количество файлов - $fileCount"
        } else {
            "$field : количество файлов - $fileCount"
        }

}

fun main() {

    val newFolder = Folder(
        _name = "Новая папка",
        fileCount = 10,
        isSecret = false,
    )

    println(newFolder.name)

    newFolder.isSecret = true

    println(newFolder.name)

}
