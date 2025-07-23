package StudyMaterial

class ConcreteFactory1: AbstractFactory() {
    override fun overrideMethod(type: String): AbstractProduct {
        return when (type) {
            "1" -> ConcreteProductA1()
            "2" -> ConcreteProductA2()
            "3" -> ConcreteProductA3()
            else -> NullProduct()
        }
    }
}

class ConcreteFactory2: AbstractFactory() {
    override fun overrideMethod(type: String): AbstractProduct {
        return when (type) {
            "1" -> ConcreteProductB1()
            "2" -> ConcreteProductB2()
            "3" -> ConcreteProductB3()
            else -> NullProduct()
        }
    }
}