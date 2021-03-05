package bot

fun main() {
    greet("Alexa", "2021")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = readLine()!!
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = readLine()!!.toInt()
    val rem5 = readLine()!!.toInt()
    val rem7 = readLine()!!.toInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = readLine()!!.toInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")

    var answer = readLine()!!.toInt()

    while (answer != 2) {
        println("Please, try again.")
        answer = readLine()!!.toInt()
    }
}

fun end() {
    println("Congratulations, have a nice day!")
}
