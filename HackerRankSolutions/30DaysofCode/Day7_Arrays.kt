import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)
    val n:Int = reader.nextInt()
    val a = IntArray(n)
    for (i in 1..n){
        val element:Int = reader.nextInt()
        a[i-1] = element
    }
    for (i in (a.size-1) downTo 0){
        print("${a[i]} ")
    }
}