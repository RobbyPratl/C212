
public class Address {
    private int houseNumber;
    private String street;
    private Integer apartmentNumber;
    private String city;
    private String state;
    private int zipCode;

    public Address(int houseNumber, String street, Integer apartmentNumber, String city, String state, int zipCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(int houseNumber, String street, String city, String state, int zipCode) {
        this(houseNumber, street, null, city, state, zipCode);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(Integer apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        String addressString = houseNumber + " " + street;
        if (apartmentNumber != null) {
            addressString += " Apt " + apartmentNumber;
        }
        addressString += "\n" + city + ", " + state + " " + zipCode;
        return addressString;
    }

    public boolean comesBefore(Address other) {
        return this.zipCode < other.zipCode;
    }
}
