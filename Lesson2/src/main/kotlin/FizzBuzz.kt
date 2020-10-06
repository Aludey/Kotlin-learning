// 4 ->
// делится на 3 -> fizz
// делится на 5 -> buzz
// 3 и 5 -> fizzbuzz

fun fizzbuzz(data : Int) : String {
    if (data % 3 == 0)
        if (data % 5 == 0) return "$data: Fizz Buzz"
        else return "$data: Fizz"
    else if (data % 5 == 0) return "$data: Buzz"
    return "$data: No Fizz Buzz"

    /*when
    {
        data % 3 == 0 && data % 5 == 0 -> return "$data: Fizz Buzz"
        data % 3 == 0 -> return "$data: Fizz"
        data % 5 == 0 ->return "$data: Buzz"
        else -> return "$data: No Fizz Buzz"
    }*/
}

fun main()
{
    for (i in 0..25)
    {
        println(fizzbuzz(i))
    }
}