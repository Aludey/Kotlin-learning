package graphics

class Rectangle (val height : Int, val width : Int)
{
    val isSquare : Boolean
        get() = height == width
    val area : Int
        get() = height * width
    var depth : Int = 0
        set(value) {
            println("Old value $field, New value $value")
            field = value
        }
}

fun main()
{
    println(
        Rectangle(12,13).isSquare
    )
    println(
        Rectangle(12,12).isSquare
    )
    println(
        Rectangle(6,10).area
    )

    var r = Rectangle(12,20)
    r.depth = 12
}