package color

enum class Color(val r: Int, val g : Int, val b : Int) {
    RED(255, 0, 0 ), GREEN(0, 255, 0), BLUE(0, 0, 255);
    fun rgb() = r *256*256 + g*256 + b
}

fun main()
{
    println(Color.RED)
}