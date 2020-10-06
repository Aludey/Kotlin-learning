package functions

import java.lang.StringBuilder

class LazyClass (val initializer: () -> Int){
    val initial : Int by lazy { initializer() }
}

class Counter{
    var numberOfGets = 0
    var number : Int = 0
    get() : Int { // нет fun!
        numberOfGets++
        return field // именно филд
    }
}

//fun Int.isOdd() : Boolean =  this % 2 == 1
//fun Int.isEven() : Boolean =  this % 2 == 0

val isOdd: Int.() -> Boolean = {this % 2 == 1}
val isEven: Int.() -> Boolean = {this % 2 == 0}

fun Collection<String>.formatString(
    prefix: String ="[",
    suffix: String = "]",
    delim :String = ","
): String {
    val result = StringBuilder()
    result.append(prefix)
    for ((index, element) in this.withIndex()){
        if (index!=0)
            result.append((delim))
        result.append(element)

    }
    result.append(suffix)
    return result.toString()
}

fun main(){
    val claz = Counter()
    claz.number
    claz.number
    println(claz.numberOfGets)

    val init: () -> Int = {
        println("init")
        3
    }

    val lazyClass = LazyClass(init)
    lazyClass.initial
    lazyClass.initial

    println(
        listOf("abc","def","jhk").formatString("{","}")
    )

}