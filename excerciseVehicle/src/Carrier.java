public class Carrier {

    public Vehicle vehicle;
    public Carrier(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public String toString() {
        return "Carrier Vehicle: " + vehicle.toString();
    }
}
