package strings

import java.lang.StringBuilder

fun String.lastCharOf() : Char = this.get(this.length - 1)
//fun String.lastCharOf() : Char = get(length - 1)

fun List<String>.firstElemOf() : String = get(0)

// string allMatchesOF(String): List<String>
fun String.allMatchesOf(regexp : String) : List<String>
{
    var ret = mutableListOf<String>()
    val found = regexp.toRegex().findAll(this)
    for(result in found)
    {
        ret.add(result.value)
    }
    return ret
}



fun main()
{
    println("Java".lastCharOf())
    val list = listOf("ABC","BCD","CDE")
    println(list.firstElemOf())

    val line = """2020-01-14 12:13:58.374 EET FINE: LOGIN (CASSystemUser): UserID="CASSystemUser", Client="Server client", Origin="193.42.108.58", SessionID="ad77c93f-b1e9-43c8-aa64-aff4630d8473" """
    val regexp = """(\d{4}-\d{2}-\d{2}).+LOGIN \(([^)]+)\)"""
    println(line.allMatchesOf(regexp))

}