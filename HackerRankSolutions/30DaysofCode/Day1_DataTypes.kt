fun main(args: Array<String>){
    val i = 4
    val d = 4.0
    val s = "HackerRank"

    val i_read = readLine()!!.toInt()
    val d_read = readLine()!!.toDouble()
    val s_read = readLine()!!.toString()

    println("""
        Sum of i: ${i+i_read}
        Sum of d: ${d+d_read}
        Concatenation of s: ${s+s_read}
    """.trimIndent())
}