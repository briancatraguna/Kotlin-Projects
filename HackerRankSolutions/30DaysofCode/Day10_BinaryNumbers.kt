import java.util.Collections.max
import java.util.Scanner

fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()
    val binary = intToBinary(n)
    val result = countConsecutiveOnes(binary)
    println(result)
}

fun intToBinary(n:Int):String{
    val binArray : MutableList<Int> = mutableListOf()
    var binaryMultiples: Int = 1
    while (binaryMultiples<n){
        binArray.add(0,binaryMultiples)
        binaryMultiples = binaryMultiples * 2
    }

    var num : Int = n
    var count : Int = 0
    var filterArray : MutableList<Int> = mutableListOf()
    while (true){
        var item = binArray[count]
        if (item<=num){
            filterArray.add(item)
            num = num - item
        }
        count ++
        if (count==(binArray.size)){
            break
        }
    }
    var binary:String = ""
    for (item in binArray){
        if (item in filterArray){
            binary = binary+"1"
        } else {
            binary = binary+"0"
        }
    }
    return binary
}

fun countConsecutiveOnes(binary:String):Int{
    var consecutive:Int = 0
    var consecutiveList:MutableList<Int> = mutableListOf()
    for (i in 0..binary.length-1){
        var number = binary[i].toString()
        if (number=="1"){
            consecutive ++
        }
        else {
            consecutiveList.add(consecutive)
            consecutive = 0
        }
        if (i==binary.length-1){
            consecutiveList.add(consecutive)
        }
    }
    val result = max(consecutiveList)
    return result
}