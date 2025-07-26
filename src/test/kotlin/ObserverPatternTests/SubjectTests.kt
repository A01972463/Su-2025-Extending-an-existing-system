import Shipments.AbstractShipment
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

class SubjectTests {
    @Test
    fun testSubjectRegister() {
        val server = TrackerViewModel
        val shipment = AbstractShipment.createShipment("Standard")

        server.registerObserver(shipment)
        assertEquals("Standard", server.shipments[0].toString())
    }

    @Test
    fun testSubjectRemove() {
        TODO()
    }

    @Test
    fun testSubjectNotify() {
        TODO()
    }
}