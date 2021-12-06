fun main(){
    val number = 8
    println(number::class.simpleName)

    val numberTwo = 9999999999999
    println(numberTwo::class.simpleName)

    val numberThree = 99999999999.99F
    println(numberThree::class.simpleName)

    val numberFour = 99999999999.99
    println(numberFour::class.simpleName)

    println(numberTwo.toInt())

    val numberCast:Int=numberTwo as Int
    println(numberCast)
}