abstract class AbstractFactory {
    fun commonFactoryMethod(): String {
        val statement = "Abstract method call from Abstract Factory."
        println(statement)
        return statement
    }
    abstract fun overrideMethod(type: String): AbstractProduct
}