fun main(args: Array<String>){
    println("Number of test cases: ")
    val numTestCases:Int = readLine()!!.toInt()
    for (i in 1..numTestCases){
        var evenChars:String = ""
        var oddChars:String = ""
        println("String s: ")
        var s:String = readLine()!!.toString()
        for (j in 0..(s.length-1)){
            if (j%2==0){
                evenChars = evenChars+s[j]
            } else{
                oddChars = oddChars+s[j]
            }
        }
        println("$evenChars $oddChars")
    }
}