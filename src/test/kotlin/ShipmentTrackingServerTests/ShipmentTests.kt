import Shipments.AbstractShipment
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShipmentTests {
    @Test
    fun testCreateShipment() {
        val server = TrackerViewModel
        val shipmentTypes = arrayOf("Standard", "Overnight", "Express", "Bulk")

        shipmentTypes.forEach {
            val shipment = AbstractShipment.createShipment(it)
            server.registerObserver(shipment)
            assertEquals(it, shipment.toString())
        }

        val shipment = AbstractShipment.createShipment("Error")
        assertEquals("Null", shipment.toString())
    }

    @Test
    fun testShipmentUpdate() {
        TODO()
    }
}