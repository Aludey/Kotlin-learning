package cru

enum class Cru
    (val level: Int)
{
    CRU(80), PREMIER(90),GRAND(100);

    override fun toString() : String = when(this)
    {
        CRU -> "Base cru"
        PREMIER -> "Premier cru"
        GRAND -> "Grand cru"
    }
}

fun main()
{
    println(Cru.GRAND)
    val cru = Cru.valueOf("PREMIER")
    println(cru)
    Cru.values().forEach { println(it) }
}