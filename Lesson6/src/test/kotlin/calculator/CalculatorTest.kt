package calculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance


//@TestInstance(TestInstance.Lifecycle.PER_CLASS) //если уверен, что нет сайдэффектов, перестанет создаваться куча экземпляров
class CalculatorTest {
    init {
        println("init")
    }

    @Test
    fun calcAdd(){
        println("calcAdd")
        val calculator = Calculator(15)
        calculator.add(2)
        assertEquals(
            17,
            calculator.get(),
            "15+2 should give 17"
        )
    }

    @Test
    fun calcMul(){
        println("calcAdd")
        val calculator = Calculator(25)
        calculator.mul(2)
        assertEquals(
            50,
            calculator.get(),
            "25*2 should give 50"
        )
    }
}