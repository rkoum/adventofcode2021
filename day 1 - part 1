import java . io . File
import java . io . InputStream

fun main(args: Array<String>) {
    val inputStream: InputStream = File("adv.txt").inputStream()
    val lineList = mutableListOf<Int>()
    var counter = 0
    inputStream.bufferedReader().forEachLine { lineList.add(it.toInt()) }
    for(n:Int in 1 .. lineList.size-1){
        if(lineList[n]>lineList[n-1]){
            counter++
        }
    }
    println(counter)
}
