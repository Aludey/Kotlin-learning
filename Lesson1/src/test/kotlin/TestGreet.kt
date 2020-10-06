import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException
import java.math.BigDecimal

class TestGreet{

    @Test
    fun greetSvetaIvanova()
    {
        // Sveta Ivanova -> Hello, Sveta Ivanova
        assertEquals("Hello, Sveta Ivanova", greeting("Sveta", "Ivanova"))

    }
    //JUnit 5 -> fun 'имя для Светы ивановой' () {}

    @Test
    fun jpTenYearSalary()
    {
        // 20000, 10 -> 120000
        assertEquals(120000.toBigDecimal(), japaneseSalary(20000.toBigDecimal(), 10))
    }

    @Test
    fun jpNegativeSalary()
    {
        val thrown = assertThrows<IllegalArgumentException> {
            japaneseSalary((-10).toBigDecimal(), 12)
        }
        assertEquals("Base salary can't be negative", thrown.message)
    }
}