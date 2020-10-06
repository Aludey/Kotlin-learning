package `object`

object Singleton{
    var name : String = "Dima"
}

class Outer{
    companion object Loader{
        fun hello() = println("hello from companion object")
        fun get() : Outer = Outer() // можно написать функцию вызывающую приватный конструктор
    }
}

interface  ClickListener{
    fun click()
}

class View{
    fun setOnClickListener(listener: ClickListener){
        //
    }
}

fun main(){
    Singleton.name = "Vlad"
    println(Singleton.name)

    Outer.Loader.hello()

    val listener : ClickListener = object  : ClickListener{
        override fun click() {
            TODO("not implemented")
        }
    }

    val view = View()
    view.setOnClickListener(listener)

    view.setOnClickListener(object : ClickListener{
        override fun click() {
            TODO("not implemented")
        }
    })
}