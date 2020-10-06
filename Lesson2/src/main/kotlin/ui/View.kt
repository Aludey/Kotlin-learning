package ui

interface View {
    fun click()
    fun whoAmI() = println("I'm a view!")
}

class Button() : View{
    override fun click() {
        println("Button click")
    }

    override fun whoAmI() = println("I'm a button!")
}

class TextView : View{
    override fun click() = println("TextView click")
    override fun whoAmI() = println("I'm a TextView!")
}

interface Shape {
    fun whoAmI() = println("I'm a shape!")
}

fun main()
{
    //val button = Button()
   // button.click()
   // button.whoAmI()
    val list : List<View> = mutableListOf()
    val v1 : View = Button()
    val v2 : View = TextView()
    v1.whoAmI()
    v2.whoAmI()
}