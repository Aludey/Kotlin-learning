package calc

import java.lang.IllegalArgumentException
import java.lang.StringBuilder

fun Any.print() : String = when (this)
    {
        is Int -> "Int: ${this.toString()}S"
        is String ->  "String: ${this.toString()}"
        else ->  "Don't know: ${this.toString()}"
    }

fun fib(number : Int) : Boolean {
    val fibs = listOf<Int>(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155)
    for (i in fibs){
        if (i == number) return true
    }
    return false
}

fun sum(list : List<Int>) : Int
{
    var ret =0
    for (i in list)
    {
        ret +=i
    }
    return ret
}

fun List<Int>.sumOf() : Int
{
    var ret = 0
    for (i in this)
    {
        ret +=i
    }
    return ret
}

//начинаются с цифры буквы
// содержат цифры буквы и _
// >4
fun isValidId(string: String) : Boolean
{
    val regexp = """[a-zA-Z0-9]\w{4,}"""
    return string.matches(regexp.toRegex())
}

//Goat
//Cow
//Dog
//Cat
//say
interface Animal
{
    fun say()
}

class Goat() : Animal{
    override fun say() = println("Beee!")
}
class Cow() : Animal{
    override fun say() = println("Mooo!")
}
class Dog() : Animal{
    override fun say() = println("Woof!")
}
class Cat() : Animal{
    override fun say() = println("Meow!")
}

sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
class Mul(val left: Expr, val right: Expr) : Expr()


fun eval(e: Expr) : Int {
    return when(e)
    {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        is Mul -> eval(e.left) * eval(e.right)
        //else -> throw IllegalArgumentException("Unknown expresion") Убрали через sealed class
    }
}

fun  StringBuilder.lastCharOf():Char=get(length-1) //функция расширения

var StringBuilder.lastCharOf : Char // свойство расширения
    get() = get(length - 1)
    set(value) = setCharAt(length-1, value)

fun main()
{
    val long : Long = 212
    val int : Int = long.toInt()
    val int1 : Int = "123".toInt()

    println("123".print())
    println(123.print())
    println(12.2f.print())

    println(fib(610))
    println(fib(333))

    println(isValidId("4AB_CD"))
    println(isValidId("4AD"))

    val farm = listOf<Animal>(Dog(),Cow(),Dog(),Goat(), Cat())
    for (animal in farm) animal.say()

    println(
        eval(
            Sum(
                Num(2),
                Mul(
                    Num(5), Num(6)
                )
            )
        )
    )

    var b = StringBuilder("hello")
    b.lastCharOf = '!'
    println(b)
}