import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)
    val a:Int = reader.nextInt()
    val b:Int = reader.nextInt()
    val c:Int = reader.nextInt()
    val s:String = reader.next()
    println("${a+b+c} $s")
}