package Problem1;

public class Driver {
    private String name;
    private int age;
    private boolean isLicense;

    public Driver(String name, int age, boolean isLicense) {
        this.age = age;
        this.isLicense = isLicense;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLicense() {
        return isLicense;
    }

    public void setLicense(boolean isLicense) {
        this.isLicense = isLicense;
    }

}