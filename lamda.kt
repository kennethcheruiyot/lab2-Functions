fun main(args: Array<String>) {
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))
    println(updateDirty(30, waterFilter))
    println(updateDirty(15, ::increaseDirty))
    }

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
fun increaseDirty( start: Int ) = start + 1
