import Shipments.AbstractShipment
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

class TrackerTests {
    @Test
    fun testSubjectMethods(){
        val server = TrackingServer
        val shipment = AbstractShipment.createShipment("Standard")

        server.registerObserver(shipment)
        assertEquals("Standard", server.shipments[0].toString())
    }

    @Test
    fun testObserverInit() {
        val server = TrackingServer
        val shipmentTypes = arrayOf("Standard", "Overnight", "Express", "Bulk")

        shipmentTypes.forEach {
            val shipment = AbstractShipment.createShipment(it)
            server.registerObserver(shipment)
            assertEquals(it, shipment.toString())
        }

        val shipment = AbstractShipment.createShipment("Error")
        assertEquals("Null", shipment.toString())
    }
}