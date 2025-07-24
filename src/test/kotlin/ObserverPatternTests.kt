import Shipments.AbstractShipment
import org.junit.jupiter.api.Test

class ObserverPatternTests {
    @Test
    fun testInit(){
        val server = TrackingServer
        val shipmentTypes = arrayOf("Standard", "Overnight", "Express", "Bulk", "Error")
        val shipment = AbstractShipment.create
        server.registerObserver(observer = )
        shipmentTypes.forEach {
            server.registerObserver(AbstractShipment.createShipment(it))
        }
    }
}