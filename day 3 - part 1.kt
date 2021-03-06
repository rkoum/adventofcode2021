import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {

    println("Gamma:  " + a('1', '0') + "   decimal:  " + a('1', '0').toInt(2))
    println("Epsilon:  " + a('0', '1') + "   decimal:  " + a('0', '1').toInt(2))
    println("Product:  " + a('1', '0').toInt(2) * a('0', '1').toInt(2))
}

fun a(x: Char, y: Char): String {
    val inputStream: InputStream =
        File("digits.txt").inputStream()
    val lineList = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    var z = ""
    for (j: Int in 0..11) {
        var counter = 0
        for (i: Int in 0..999) {

            if (lineList[i][j] == '1') {
                counter++
            }
        }
        if (counter > 500) {
            z = z + x
        } else {
            z = z + y
        }
    }
    return z
}
