package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    @Test
    void createCarTest() {
        Car car = new Car(5);
        assertEquals(TransmissionType.AUTOMATIC, car.getTransmissionType());
        assertEquals(5, car.getNumberOfGears());
    }
    @Test
    void crateVehicleTest() {
        Vehicle vehicle = new Vehicle(4);
        assertEquals(TransmissionType.MANUAL, vehicle.getTransmissionType());
        assertEquals(4, vehicle.getNumberOfGears());
    }
    @Test
    void createVehicleWithoutDefaultType() {
        Vehicle vehicle = new Vehicle(3,TransmissionType.AUTOMATIC);
        assertEquals(3, vehicle.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, vehicle.getTransmissionType());
    }
    @Test
    void crateMotorCycle() {
        Motorcycle motorcycle = new Motorcycle(4);
        assertEquals(TransmissionType.SEQUENTIAL, motorcycle.getTransmissionType());
    }
    @Test
    void createTruckTest() {
        Truck truck = new Truck(4, TransmissionType.AUTOMATIC);
        assertEquals(TransmissionType.AUTOMATIC, truck.getTransmissionType());
    }
    @Test
    void createPolimorfism() {
        Vehicle vehicle = new Car(4);
        assertEquals(TransmissionType.AUTOMATIC, vehicle.getTransmissionType());

        Vehicle vehicle2 = new Truck(3,TransmissionType.MANUAL);
        assertEquals(TransmissionType.MANUAL, vehicle2.getTransmissionType());

        Vehicle vehicle3 = new Motorcycle(5);
        assertEquals(TransmissionType.SEQUENTIAL, vehicle3.getTransmissionType());
    }
}
