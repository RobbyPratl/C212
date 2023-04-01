package problem1;

public class Driver extends Person {
    private final String name;
    private int age;
    private boolean isLicense;

    public Driver(String name, int age) {
        this.name = name;
        if (age <= 0) {
            this.age = 0;
            this.isLicense = false;
        } else {
            this.age = age;
            this.isLicense = age >= 16;
        }
    }

    public String getName() {
        if (name == null) {
            return " ";
        } else {
            return name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.isLicense = age >= 16;
    }

    public boolean isLicensed() {
        return isLicense;
    }

    public void setLicense(boolean isLicense) {
        this.isLicense = isLicense;
    }

    @Override
    public String getDetails() {
        String licenseStatus = (isLicensed()) ? "licensed" : "not licensed";
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Does the Person have a license? " + licenseStatus;
    }

}
