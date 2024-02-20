public class Motorcycle extends Vehicle {

    public int numberOfHandBrakes;
    private int maxNumOfPassengers;
    private int maxSpeed;
    public Motorcycle(int numberOfWheels, String model, int numberOfHandBrakes) {
        super(numberOfWheels, model);
        this.numberOfHandBrakes = numberOfHandBrakes;
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
        return super.toString() + ", NumberOfDoors: " + numberOfHandBrakes;
    }
}
