package problem4;

public class Car extends Vehicle {
    private int mileage;

    public Car(int gear, int speed, int mileage) {
        super(gear, speed);
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Mileage: " + getMileage();
    }

}
