import java.math.BigDecimal
import java.time.Year

// oneline

/*
 * multiline
 */

/*
/* embedded */
 */

val firstname: String = "Vlad"
var lastname = "Nikitin"
var age = 23

const val DEBUG = true // in java: public static final

fun main(args : Array<String>){
    // firstname = "Boris" !
    age = 24
    // age = "twenty" !

    // *Выражения*
    // if
    val temperature = 26
    /* val condition = if(temperature < -5)
         "cold"
     else
         if(temperature < 5)
             "~ zero"
         else
             "hot"
     */
    val condition = when {
        temperature < -5 -> "cold"
        temperature < 5 -> "~ zero"
        else -> "hot"
    }
    // try / catch

    println("Hello, world!")

    // nullable
    var position : String? = "programmer"
    position = null
    if (position != null)
        println("length is " + position.length)

    println("length is " + position?.length) // возвращает рез-т или "null"
    println(position?.length ?: 0) // если null, то правое
   // println("length is " + position!!.length)

    val obj : Any = "15"
    if(obj is String){ // smart cast  !is
        println("len is " + obj.length)
    }

    val x : String = obj as String // unsafe cast
   // val z : String = age as String // ClassCastException

    val k : String? = age as? String
    println(k)

    //строковые шаблоны
    println("Имя: " + firstname + " Фамилия: " + lastname + " Возраст: " + age)
    println("Имя: $firstname Фамилия: $lastname Возраст: ${age + 1}")

    println("""
        one line
        two line
        three line
        \""".trimIndent())

    println("""
        |SELECT * FROM USERS
        |WHERE age > 24
        |GROUP BY NAME
        """.trimMargin())

    println(greeting(last = lastname, first = firstname))
    println(greeting(first = firstname))

    // while/do-while
    var counter = 0
    while (counter < 10)
    {
        println("${counter++}")
    }

    val oneToFive = 1..5
    val letters = 'a'..'z'
    val words = "Java".."Yaml"

    if ('d' in letters) {
        //true
    }
    if ("Kotlin" in words){
        //true
    }

    // for
    for (letter in letters)
    {
        println(letter)
    }

    val array : Array<Int> = arrayOf<Int>(1, 2, 3, 4) // val - можем менять содержимое, но не размер
   // val array = arrayOf<Int>(1, 2, 3, 4)

    val list = listOf("One", "Two", "Three")
    val mutableList = mutableListOf("One", "Two", "Three")
    mutableList[0]="ONE"
    mutableList.add("Four")

    val pair = Pair("one","two")
    println("first: ${pair.first} second: ${pair.second}")

    val infixPair = 1 to "One"

    val map = mutableMapOf(1 to "one", 2 to "two")

    for((f, s) in map)
    {
        println("f: $f s: $s")
    }

    val (a,b,c) = Triple(23, "Vlad Nikitin", listOf(1,2,3))
}

fun japaneseSalary(base : BigDecimal, years : Int) : BigDecimal
{
    require(base > BigDecimal.ZERO) { "Base salary can't be negative" }
    return base + (10000 * years).toBigDecimal()
}

//fun greeting(first : String, last : String = "Nikitin") : String = "Hello, $first $last"

fun greeting(first : String, last : String = "Nikitin") : String
{
    require(!first.isBlank()){"Enter firstName please"} // Срабатывает IllegalArgumentException
    //requireNotNull()
    //check()
    //assert()
    return "Hello, $first $last"
}
