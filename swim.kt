fun swim(speed: String = "fast") {
    println("swimming $speed")
}
fun main(args: Array<String>) {
    swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed = "turtle-like") // named parameter

}
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"
