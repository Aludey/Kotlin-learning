package users

class Person(
    val name: String,
    var isMarried : Boolean = false
)

fun main()
{
    val max = Person("Max")
    println("${max.name} ${max.isMarried}")
}