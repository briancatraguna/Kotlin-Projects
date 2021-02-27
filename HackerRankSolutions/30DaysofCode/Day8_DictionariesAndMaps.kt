import java.util.Scanner

fun main(){
    //Init scanner object
    val reader = Scanner(System.`in`)
    //Size of map
    val n: Int = reader.nextInt()
    //Init map
    var phoneBook = emptyMap<String,Int>()
    //For loop to enter entries
    for (i in 1..n){
        var name = reader.next()
        var telNumber = reader.nextInt()
        phoneBook = phoneBook + Pair(name,telNumber)
    }
    //Queries
    while (true){
        var nameQuery = reader.next()
        try{
            println(phoneBook[nameQuery])
        } catch(e:Exception){
            break
        }
    }
}