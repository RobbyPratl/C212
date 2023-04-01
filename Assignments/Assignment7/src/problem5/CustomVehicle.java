package problem5;

import java.util.ArrayList;
import java.util.List;

import problem1.*;

public class CustomVehicle {
    private int gear;
    private int speed;
    private List<Person> passengers;
    private int capacity;

    public CustomVehicle(int gear, int speed, int capacity) {
        this.gear = gear;
        this.speed = speed;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Person> getPassengers() {
        return passengers;
    }

    public void addPassenger(Person person) {
        if (passengers.size() < capacity) {
            passengers.add(person);
            System.out.println(((Driver) person).getName() + " has been added to the vehicle.");
        } else {
            System.out.println("Vehicle is at maximum capacity.");
        }
    }

    public void removePassenger(Person person) {
        if (passengers.remove(person)) {
            System.out.println(((Driver) person).getName() + " has been removed from the vehicle.");
        } else {
            System.out.println(((Driver) person).getName() + " is not in the vehicle.");
        }
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Capacity cannot be negative!");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean startVehicle() {
        boolean isDriverLicensed = false;

        for (Person passenger : passengers) {
            if (passenger instanceof Driver) {
                Driver driver = (Driver) passenger;
                if (driver.isLicensed()) {
                    isDriverLicensed = true;
                    break;
                }
            }
        }

        if (!isDriverLicensed) {
            System.out.println("No licensed driver is in the vehicle.");
            return false;
        }

        if (passengers.size() > 0 && passengers.size() <= capacity) {
            System.out.println("Vehicle started.");
            return true;
        } else {
            System.out.println("Vehicle cannot start.");
            return false;
        }
    }
}
