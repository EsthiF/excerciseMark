public class Car extends Vehicle {
    public int numberOfDoors;
    private int maxNumOfPassengers;
    private int maxSpeed;
    public Car(int numberOfWheels, String model, int numberOfDoors) {
        super(numberOfWheels, model);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public int getNumberOfPassenger() {
        return maxNumOfPassengers;
    }
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
    @Override
    public String toString() {
        return super.toString() + ", NumberOfDoors: " + numberOfDoors;
    }
}

