package StudyMaterial

class ConcreteProductA1: AbstractProduct() {
    override fun toString(): String {
        return "A1"
    }
}
class ConcreteProductA2: AbstractProduct() {
    override fun toString(): String {
        return "A2"
    }
}
class ConcreteProductA3: AbstractProduct() {
    override fun toString(): String {
        return "A3"
    }
}
class ConcreteProductB1: AbstractProduct() {
    override fun toString(): String {
        return "B1"
    }
}
class ConcreteProductB2: AbstractProduct() {
    override fun toString(): String {
        return "B2"
    }
}
class ConcreteProductB3: AbstractProduct() {
    override fun toString(): String {
        return "B3"
    }
}
class NullProduct: AbstractProduct() {
    override fun toString(): String {
        return "Null"
    }
}