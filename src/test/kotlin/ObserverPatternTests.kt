import Shipments.AbstractShipment
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class ObserverPatternTests {
    @Test
    fun testInit(){
        val server = TrackingServer
        val shipmentTypes = arrayOf("Standard", "Overnight", "Express", "Bulk", "Error")

        shipmentTypes.forEach {
            var shipment = AbstractShipment.createShipment(it)
            server.registerObserver(shipment)
            println(server.toString())
            println(shipment.toString())
        }
    }
}