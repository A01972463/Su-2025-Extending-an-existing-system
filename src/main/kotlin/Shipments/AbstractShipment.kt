package Shipments

import Observer

abstract class AbstractShipment: Observer {

    companion object {
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
}