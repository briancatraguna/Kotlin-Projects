fun main(args: Array<String>){
    println("Enter meal cost: ")
    val mealCost = readLine()!!.toInt()
    println("Enter tip percent: ")
    val tipPercent = readLine()!!.toDouble()
    println("Enter tax percent: ")
    val taxPercent = readLine()!!.toDouble()

    println("${totalCost(mealCost,tipPercent,taxPercent)}")
}

fun totalCost(mealCost:Int,tipPercent:Double,taxPercent:Double):Double{
    val tip:Double = mealCost*(tipPercent/100)
    val tax:Double = mealCost*(taxPercent/100)
    return mealCost+tip+tax
}