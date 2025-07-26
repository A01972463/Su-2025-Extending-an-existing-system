import StudyMaterial.ConcreteFactory1
import StudyMaterial.ConcreteFactory2
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FactoryTests {
    @Test
    fun testCreateProducts() {
        val testFactory1 = ConcreteFactory1()
        val testFactory2 = ConcreteFactory2()
        val products = arrayOf("1", "2", "3")

        products.forEach {
            val product = testFactory1.overrideMethod(it)
            assertEquals("A$it", product.toString())
        }

        products.forEach {
            val product = testFactory2.overrideMethod(it)
            assertEquals("B$it", product.toString())
        }
    }
}