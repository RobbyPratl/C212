package Labs.Lab08.Employee;

public class Executive extends Employee {
    private String department;
    private int numberOfShares;
    private static int sharesOwnedByExecutives = 0;

    public Executive(String name, double salary, String department, int numberOfShares) {
        super(name, salary);
        this.numberOfShares = numberOfShares;
        sharesOwnedByExecutives += numberOfShares;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int newNumberOfShares) {
        int difference = newNumberOfShares - numberOfShares;
        numberOfShares = newNumberOfShares;
        sharesOwnedByExecutives += difference;
    }

    public static int getSharesOwnedByExecutives() {
        return sharesOwnedByExecutives;
    }

    @Override
    public String toString() {
        return super.toString() + ", Shares Owned: " + numberOfShares;
    }

    public String getDepartment() {
        return department;
    }
}
