package problem4;

public class Vehicle {
    private int gear;
    private int speed;

    public Vehicle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = (gear >= 0) ? gear : 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = (speed >= 0) ? speed : 0;
    }

    public void accelerate(int amount) {
        speed += amount;
    }

    public void brake(int amount) {
        if (amount >= speed) {
            speed = 0;
        } else {
            speed -= amount;
        }
    }

    @Override
    public String toString() {
        return "Gear: " + getGear() + "\n" + "Speed: " + getSpeed();
    }
}
