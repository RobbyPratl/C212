package problem2;

public class Customer {
    private String name;
    private String address;
    private int number;

    public Customer(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name != null) ? name : "";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = (address != null) ? address : "";

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = (number <= 0) ? 0 : number;
    }

    public String mailCheck() {
        return "check has been mailed to " + getName() + " to the address " + getAddress() + " and number "
                + getNumber();
    }
}
