package operators

data class Point(val x: Int, val y :Int){
    operator fun plus(other :Point):Point{
        return Point(x + other.x, y + other.y)
    }
}

class Rect(val ul : Point, val lr : Point) {
    operator fun contains(point: Point): Boolean {
        return point.x in ul.x .. lr.x && point.y in ul.y .. lr.y
    }
}

class Hedgehog {
    operator fun plus(s: Snake): Barbwire {
        return Barbwire()
    }
}

class Snake
class Barbwire{
    fun hello() : String = "Barbwire"
}

val lazyValue : String by lazy{
    println("Initializing") // срабатывает 1 раз при инициализации, не инициализируется если не вызывается в коде
    "Hello"
}

class  LateInit{
    var name : String = "Vlad"
    lateinit var late : String

    fun init(){
        println("initialized: ${this::late.isInitialized}")
        late = "initialized"
        println("initialized: ${this::late.isInitialized}")
    }
}

fun main(){
    val point1 = Point(3,3)
    val point2 = Point(5,5)
    println(point1 + point2)

    val rect = Rect(Point(4,4), Point(20,10))

    println(point1 in rect)
    println(point2 in rect)

    val h = Hedgehog()
    val s = Snake()
    val b = h + s
    println(b.hello())

    println(lazyValue)
    println(lazyValue)

    var lateInit = LateInit()
    //lateInit.late // UninitializedPropertyAccessException
    lateInit.init()
    println(lateInit.late)
}