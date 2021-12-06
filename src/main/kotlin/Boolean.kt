fun main(){


    val isNotChristmas=false
    val isChristmas=true

    println(isChristmas&&isNotChristmas); //true and false
    println(isChristmas||isNotChristmas); //true or false


    println(isChristmas.and(false)); //true and false
    println(isChristmas.and(true)); //true and true

    println(isChristmas.or(true)); //true or true
    println(isChristmas.or(false)); // true or false

}