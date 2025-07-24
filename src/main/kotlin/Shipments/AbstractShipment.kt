package Shipments

import Observer

interface AbstractShipment: Observer {
    override fun update() {
        TODO("Implement Update")
    }

    fun createShipment(type: String): AbstractShipment {
        return when (type) {
            "Standard" -> StandardShipment()
            "Overnight" -> OvernightShipment()
            "Express" -> ExpressShipment()
            "Bulk" -> BulkShipment()
            else -> NullShipment()
        }
    }
}