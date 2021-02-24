import com.azul.crs.com.fasterxml.jackson.databind.JsonSerializer

fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    solution(n)
}

fun solution(n:Int){
    if (n%2!=0){
        println("Weird")
    } else {
        if (n>=2&&n<6){
            println("Not Weird")
        } else if (n>=6&&n<21){
            println("Weird")
        } else if (n>20){
            println("Not Weird")
        }
    }
}