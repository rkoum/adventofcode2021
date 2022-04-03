import java.io.File
import java.io.InputStream
import kotlin.math.ceil

fun main(args: Array<String>) {
    println(find('0' ,'1').toInt(2)*find('1' ,'0').toInt(2))
    }
fun find(x: Char, y:Char ):String{
    val inputStream: InputStream =
        File("C:\\Users\\aktex\\Documents\\digits.txt").inputStream()
    var lineList = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    var sum: Int = 0
    for(j:Int in 0..11) {
        sum = 0
        for (i: Int in 0..lineList.size - 1) {
            sum = sum + lineList[i].get(j).digitToInt()
        }
        if (lineList.size>1){
        when (sum) {
            in 0 until ceil(lineList.size / 2.0).toInt() -> lineList =
                lineList.filter { it.get(j) == x }.toMutableList()
            in ceil(lineList.size / 2.0).toInt()..lineList.size.toInt() -> lineList =
                lineList.filter { it.get(j) == y }.toMutableList()
            }
        }
    }
    return lineList[0]
}
