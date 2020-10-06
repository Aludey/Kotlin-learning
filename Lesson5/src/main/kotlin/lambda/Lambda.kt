package lambda

data class Person(val name : String, val age:Int)

val people = listOf(
    Person("Alice",29),
    Person("Bob",32),
    Person("Carol",31)
)

val list = listOf(1,2,3,4,5,6,7)
val nullableList : List<Int?> = listOf(1,2,3,null,6,8)
val nullableList1 : List<Int?>? = listOf(1,2,3,null,6,8)

val listOfList = listOf(
    listOf("abc", "kgb", "cia"),
    listOf("ibm", "kpmg")
)

fun main(){
    val sum : (Int, Int) -> Int = {x: Int, y:Int -> x + y}
    val some :() -> Unit = { println("hello")}

    val result = sum(1,2)

    println(
        // list.filter { x : Int -> x % 3 == 0 }
        // list.filter { x  -> x % 3 == 0 }
        // list.filter { it % 3 == 0 }
        // people.filter {it.age > 30}
        // nullableList.filter{ x -> x != null && x % 3 == 0}
        // nullableList1?.filter{ x -> x != null && x % 3 == 0}

        // people.first{it.age == 60} // NoSuchElemenyException
        // people.firstOrNull{it.age == 60}
        // people.maxBy { it.age } // minBy
        // list.distinct() только не повторяющиеся
        // people.map {it.name}

        // any none all
        // people.any {it.age ==29}
        // people.count {it.age ==31}
        // people.find {it.age ==31 && it.name.contains('o')}
        // people.map{it -> it.age.toFloat()}.average()
        // people.map{it -> it.age}.sum()
        // people.sumBy{it.age}

        // fold reduce
        // list.reduce{acc: Int, elem : Int-> acc*elem} // берет 1 значение из листа и применяет начиная с 2го
        // list.fold(1, {acc: Int, elem : Int-> acc*elem}) //задаем нач значение

        // people.groupBy{it.age}.keys
        // people.associateBy{it.age}
        // people.partition {it.age < 30}

        // listOfList.flatten()
        // listOfList.flatten().map { it.toList() }
        // listOfList.flatten().flatMap { it.toList() }
        // people.zip(list)
    )


}
