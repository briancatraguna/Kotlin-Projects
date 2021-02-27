import java.util.Scanner

fun factorial(n: Int): Int {
    return if (n==1){
        n
    } else {
        n * factorial(n-1)
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    println("Enter n:\n")
    val n = scan.nextInt()
    val result = factorial(n)
    println(result)
}