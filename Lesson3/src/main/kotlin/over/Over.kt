package over

interface Clickable
{
    fun click()
}

open class RichButton: Clickable
{
    override fun click() {}
    open fun disable(){}
}

abstract class Animated { // abstract = открыт для наследования
    abstract fun animate() // abstract - нужно прооверрайдить в подклассах
    fun startAnimate(){}
    open fun stopAnimate(){}
}

class Animator : Animated()
{
    override fun animate() {}
    override fun stopAnimate() {}
}

class  AnimatedButton : RichButton()
{
    override fun click() {}
    override fun disable() {}
}

class Outer // Внешний
{
    class Nested {} // Вложенный
    inner class Internal{ // Внутренний
        fun getOuter() : Outer = this@Outer
    }
}

class User(val name: String){
   // override fun hashCode(): Int = name.hashCode() * 37 + index
}
class User1{
    val name: String
    constructor(name: String = "Max")
    {
        println("constructor ")
        this.name = name
    }

    init {
        println("init block")
    }
}

data class Client (val name :String, val index : Int)
//data -> toString() equals() hashCode() copy() component1...componentN

fun main()
{
    val outer = Outer()
    val nested = Outer.Nested()
    val internal = outer.Internal()
    val user1 = User1()

    val misha1 = Client("Misha", 123123)
    val misha2 = Client("Misha", 123123)

    println(misha1 == misha2)

    val set = hashSetOf(misha1)
    println(set.contains(misha2))
}