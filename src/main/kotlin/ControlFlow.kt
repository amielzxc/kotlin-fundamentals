import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter your name: ");
    var name = readLine()!!

    print("Enter your age: ");

    var age = sc.nextInt();

    if (age <= 0) {
        println("Age cannot be below or equal to zero.");
    } else if (age < 18) {
        println("You are not allowed to use the service.");
    } else {
        println("You are allowed to use the service, ${name}. ");
    }








    fun dayCheck() {


        println("What is day today ")
        var dayOfWeek = readLine()!!.toLowerCase()

        //Monday -> Hey it's Monday! Let's be productive!
        //Tuesday -> Hey it's Tuesday! Choose to be happy!
        //Wednesday -> Hey it's Wednesday my dudes!
        //Thursday -> Hey it's Thursday! You're almost there!
        //Friday -> Thank God it's Friday!
        //Saturday and Sunday -> Happy Weekends! Get some life!

        when (dayOfWeek) {
            "monday" -> println("Hey it's Monday! Let's be productive!")
            "tuesday" -> println("Hey it's Tuesday! Choose to be happy!")
            "wednesday" -> println("Hey it's Wednesday my dudes!")
            "thursday" -> println("Hey it's Thursday! You're almost there!")
            "friday" -> println("Thank God it's Friday!")
            "saturday" -> println("Happy Weekends! Get some life!")
            "sunday" -> println("Happy Weekends! Get some life!")
            else -> println("Invalid input")
        }

    }



    fun calculatorCompute() {

        //Ask for first number
        println("First number: ")
        var firstNumber = readLine()!!.toDouble()

        //Ask for second number
        println("Second number: ")
        var secondNumber = readLine()!!.toDouble()

        //Ask for operation to be done
        println("Operation ( + / - * ): ")
        var operation = readLine()!!

        //Perform the operation
        //Display the result
        when (operation) {
            "+" -> println(firstNumber + secondNumber)
            "-" -> println("${firstNumber.minus(secondNumber)}")
            "*" -> println("${firstNumber.times(secondNumber)}")
            "/" -> println("${firstNumber.div(secondNumber)}")

            else -> println("Operator is not supported")
        }
    }
    fun forLoop(){

//    for(item in 1..5){
//        println(item)
//    }

        val fruits = mapOf<Int,String>(1 to "Banana",2 to "Apple",3 to "Orange")
        for ((key,value) in fruits){
            println("$key - $value")
        }

        val users = arrayListOf<String>("Ferdie","Lisa", "Mary")
        val ages = arrayListOf<Int>(45,13,24)

        for(count in 0 until users.size){
            val username =users[count]
            val age=ages[count]
            println("$username is $age years old")
        }


    }

    fun whileLoop(){


        val exitCode: Int = 999

        println("How many people entered")
        var userInput = readLine()!!.toInt()
        var totalHumans = 0

        while (userInput != exitCode) {
            totalHumans += userInput
            println("**********$totalHumans**********")
            println("How many people entered")
            userInput = readLine()!!.toInt()


        }


    }

    fun doWhileLoop(){

        var exitCode = -1
        var userInput = 0
        var counter = 0

        do{
            print("People Entered: ")
            userInput = readLine()!!.toInt()
            if(userInput != -1) counter += userInput
            println("Total: $counter")
        }while(userInput != exitCode)
        println("Thank you for using HumanCounter!")
    }

}