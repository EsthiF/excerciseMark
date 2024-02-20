public abstract class Vehicle {

    public int numberOfWheels;
    public String model;
    Vehicle(int numberOfWheels, String model) {
        this.numberOfWheels = numberOfWheels;
        this.model = model;
    }
    public abstract int getNumberOfPassenger();

    public abstract int getMaxSpeed();
    public String toString() {
        return "Model: " + model +
                ", Number of Wheels: " + numberOfWheels +
                ", Number of Passengers: " + getNumberOfPassenger() +
                ", Max Speed: " + getMaxSpeed() + " km/h";
    }
}

