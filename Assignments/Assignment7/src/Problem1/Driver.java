package problem1;

public class Driver extends Person {
    private boolean isLicensed;

    private String name;
    private int age;

    public void setName(String name) {
        this.name = (name != null) ? name : "";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        if (age < 16) {
            this.age = age;
            setLicensed(false);
        }
        if (age >= 16) {
            this.age = age;
            setLicensed(true);
        }
        this.age = (age <= 0) ? 0 : age;
    }

    public boolean isLicensed() {
        return isLicensed;
    }

    public void setLicensed(boolean licensed) {
        isLicensed = licensed;
    }

    public Driver(String name, int age) {
        this.age = age;

        if (age >= 0) {
            if (age >= 16) {
                this.isLicensed = true;
            } else {
                this.isLicensed = false;
            }
        }

        this.name = (name != null) ? name : "";
    }

    public String getDetails() {
        String str = name + ", " + age + ", ";

        if (isLicensed) {
            str += "Licensed";
        } else {
            str += "Not Licensed";
        }
        return str;
    }
}
