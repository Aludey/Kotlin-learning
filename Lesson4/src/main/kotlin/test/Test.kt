package test

import javax.print.attribute.standard.MediaSize

fun String?.isEmptyOrNull() : Boolean = when(this){
    ""  -> true
    null -> true
    else -> false
}

// fun String?.isEmptyOrNull() : Boolean =  this?.isEmpty() ?: true

data class RationalNumber(val numerator: Int, val denomenator: Int){
    override fun toString(): String {
        return "RationalNumber: $numerator/$denomenator"
    }

    operator fun plus(other: RationalNumber) : RationalNumber {
        return if (denomenator == other.denomenator) RationalNumber(numerator+other.numerator, denomenator)
        else RationalNumber(numerator*other.denomenator+other.numerator*denomenator, denomenator*other.denomenator)
    }
    operator fun minus(other: RationalNumber) : RationalNumber {
        return if (denomenator == other.denomenator) RationalNumber(numerator-other.numerator, denomenator)
        else RationalNumber(numerator*other.denomenator-other.numerator*denomenator, denomenator*other.denomenator)
    }

    operator fun times(other: RationalNumber) : RationalNumber {
        return RationalNumber(numerator*other.numerator, denomenator*other.denomenator)
    }
    operator fun div(other: RationalNumber) : RationalNumber {
        return RationalNumber(numerator*other.denomenator, denomenator*other.numerator)
    }

}



fun Int.r() : RationalNumber {
    return  RationalNumber(this, 1)
}
fun Pair<Int,Int>.r() : RationalNumber {
    return  RationalNumber(first, second)
}

fun Int.smm(other: Int): Int = this + other // 34.smm(6) = 40
//infix fun Int.smm(other: Int): Int = this + other // 12 smm 22 = 34

open class Base
class Child : Base()

fun Base.hello() : String = "Hello base"
fun Child.hello() : String = "Hello child"

operator fun RationalNumber.unaryMinus(): RationalNumber = RationalNumber(-numerator, denomenator)


fun main(){
    println("".isEmptyOrNull()) //true
    println(null.isEmptyOrNull()) //true
    println("hello".isEmptyOrNull()) //false

    println(10.r())
    println((7 to 13).r())

    val child : Base = Child()
    println(child.hello())

    println(RationalNumber(5,10) + RationalNumber(5,10))
    println(RationalNumber(5,10) - RationalNumber(5,10))
    println(RationalNumber(5,10) * RationalNumber(5,10))
    println(RationalNumber(5,10) / RationalNumber(5,10))
}