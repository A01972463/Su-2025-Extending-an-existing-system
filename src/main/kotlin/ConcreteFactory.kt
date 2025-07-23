class ConcreteFactory: AbstractFactory() {
    override fun overrideMethod(type: String): AbstractProduct {
        return when (type) {
            "1" -> ConcreteProduct1()
            "2" -> ConcreteProduct2()
            "3" -> ConcreteProduct3()
            else -> NullProduct()
        }
    }
}