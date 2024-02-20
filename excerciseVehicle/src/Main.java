// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicleOne = new Motorcycle(2, "Harley Davidson", 0);
        Vehicle vehicleTwo = new Motorcycle(2, "Toyota", 0);
        Vehicle vehicleThree = new Car(4, "ToyotaNew", 4);
        Vehicle vehicleFour = new Car(4, "Audi", 4);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Motorcycle(2, "Yamaha", 1);
        vehicles[1] = new Car(4, "Toyota", 4);
        vehicles[2] = new Car(4, "Honda", 4);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        Carrier carCarrier = new Carrier(vehicleThree);
        Carrier motorcycleCarrier = new Carrier(vehicleTwo);

        System.out.println("Car Carrier: " + carCarrier.toString());
        System.out.println("Motorcycle Carrier: " + motorcycleCarrier.toString());
    }
}