class Person(initialAge:Int){
    var age:Int = 0
    init{
        if (initialAge>=0){
            this.age = initialAge
        } else {
            println("Age is not valid, seting age to 0.")
        }
    }

    fun yearPasses(){
        this.age++
    }

    fun amIOld(){
        if (this.age<13){
            println("You are young.")
        } else if (this.age>=13 && age<18){
            println("You are a teenager.")
        } else {
            println("You are old.")
        }
    }
}

fun main(args: Array<String>){
    val numTestCases: Int = readLine()!!.toInt()
    var person = Person(0)
    var age = 0
    for (i in 1..numTestCases){
        age = readLine()!!.toInt()
        person = Person(age)
        person.amIOld()
        for (j in 1..3){
            person.yearPasses()
        }
        person.amIOld()
    }
}
