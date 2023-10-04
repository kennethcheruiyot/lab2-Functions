fun main(args:Array<String>){
    //will assign kotlin.Unit
    val isUnit = println("This is an expression")
    val temperature = 10
    val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}"
    println(message)
    val isHot = if (temperature > 50) true else false
    println(isUnit)
    println(isHot)
}