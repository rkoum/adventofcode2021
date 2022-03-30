import java . io . File
import java . io . InputStream

fun main(args: Array<String>) {
    val inputStream: InputStream = File("C:\\Users\\aktex\\Documents\\forw.txt").inputStream()
    val lineList = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine { lineList.add(it.toString()) }
    var horizontal = 0
    var depth = 0
    for (n in 0..lineList.size - 1) {
        val str = lineList[n]
        var num = str.split(" ")[1].toInt()
        var direction = str.split(" ")[0]
        when (direction) {
            "forward" -> horizontal = horizontal + num
            "up" -> depth = depth - num
            "down" -> depth = depth + num
        }
    }
    println(horizontal*depth)
}
