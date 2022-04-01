import java . io . File
import java . io . InputStream

fun main(args: Array<String>) {
    val inputStream: InputStream = File("C:\\Users\\aktex\\Documents\\adv.txt").inputStream()
    val lineList = mutableListOf<Int>()
    var counter = 0
    inputStream.bufferedReader().forEachLine { lineList.add(it.toInt()) }
    for(n:Int in 1 .. lineList.size-3){
        if(lineList.slice(n..n+2).sum() > lineList.slice(n-1..n+1).sum()){
            counter++
        }
    }
    println(counter)
}
