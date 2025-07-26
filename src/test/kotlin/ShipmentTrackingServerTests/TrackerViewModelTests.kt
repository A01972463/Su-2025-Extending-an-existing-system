package ShipmentTrackingServerTests

import Shipments.AbstractShipment
import TrackerViewModel
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TrackerViewModelTests {
    @Test
    fun testSubjectRegister() {
        val server = TrackerViewModel
        val shipment = AbstractShipment.createShipment("Standard")

        server.registerObserver(shipment)
        assertEquals("Standard", server.shipments[0].toString())
    }

    @Test
    fun testSubjectRemove() {
        val server = TrackerViewModel

        server.removeObserver(server.shipments[0])
        assertEquals(0, server.shipments.size)
    }

    @Test
    fun testSubjectNotify() {
        val server = TrackerViewModel
        val shipmentTypes = arrayOf("Standard", "Overnight", "Express", "Bulk")

        shipmentTypes.forEach {
            val shipment = AbstractShipment.createShipment(it)
            server.registerObserver(shipment)
        }

        server.notifyObservers()

        server.shipments.forEach {
            assertEquals("Update", it.toString())
        }
    }
}