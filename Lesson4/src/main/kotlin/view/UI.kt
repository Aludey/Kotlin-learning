package view
import JavaView
import JavaClickListener

data class Person(val name:String, val age:Int)

val people = listOf(
    Person("Alice", 29),
    Person("Bob", 31),
    Person("Carol", 31)
)

fun hi() = println("hi")

fun Person.isAdult() : Boolean = age >= 18

fun main(){
    val javaView = JavaView()
    javaView.setOnClickListener(
        object : JavaClickListener{
            override fun onClick(view: JavaView?) {}
    })

    javaView.setOnClickListener{view -> println("hello")}

    //lambda
    val sum = {x: Int, y:Int ->
        println("hello")
        x+y} // Тип: (Int,Int) :Int  возвращает только последнюю строчку
    println(sum(20,10))

    val ageSort = {p:Person -> p.age}
    println(
        // people.minBy({p:Person -> p.age})
        // people.minBy() {p:Person -> p.age}
        // people.minBy {p:Person -> p.age}
        // people.minBy {p -> p.age}
        // people.minBy {it.age}
        // people.minBy(Person::age)
        people.minBy( ageSort ) //ссылки на функции только в круглых ()
    )

    var counter = 0
    people.forEach{
        counter++
    }
    println(counter)

    val personAge = Person::age //сслыка на метод класса

    val hello = ::hi
    run(hello)

    val create = ::Person
    println(create("Max",23))

    val max = create("Max",23)
    val maxage = max::age

    val adult = Person::isAdult

}