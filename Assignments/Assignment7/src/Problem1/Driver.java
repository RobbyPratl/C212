package Problem1;

public class Driver extends Person {
    private final String name;
    private int age;
    private boolean isLicense;

    public Driver(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public boolean isLicense() {
        return this.isLicense = age >= 16;
    }

    @Override
    public String getDetails() {
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Does the Person have a license? " + isLicense();
    }

}