package Vehicle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    @Test
    void testCreateCar() {
        Vehicle car = VehicleFactory.createVehicle("Car");
        assertNotNull(car);
        assertEquals("Car", car.getType());
        assertDoesNotThrow(car::drive);
    }

    @Test
    void testCreateBike() {
        Vehicle bike = VehicleFactory.createVehicle("Bike");
        assertNotNull(bike);
        assertEquals("Bike", bike.getType());
        assertDoesNotThrow(bike::drive);
    }

    @Test
    void testCreateTruck() {
        Vehicle truck = VehicleFactory.createVehicle("Truck");
        assertNotNull(truck);
        assertEquals("Truck", truck.getType());
        assertDoesNotThrow(truck::drive);
    }

    @Test
    void testCreateUnknownVehicle() {
        assertThrows(IllegalArgumentException.class, () -> {
            VehicleFactory.createVehicle("Bus");
        });
    }
}

