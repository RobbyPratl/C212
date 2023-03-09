package Labs.Lab08.Employee_Ex;

public class Executive extends Employee {
    private String department;
    private int numberOfShares;
    private int sharesOwned;

    public Executive(String name, double salary, String department, int numberOfShares) {
        super(name, salary);
        this.department = department;
        this.numberOfShares = numberOfShares;
        this.sharesOwned = numberOfShares;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int newNumberOfShares) {
        sharesOwned -= numberOfShares;
        numberOfShares = newNumberOfShares;
        sharesOwned += numberOfShares;
    }

    public int getSharesOwned() {
        return sharesOwned;
    }

    @Override
    public String toString() {
        return super.toString() + ", Shares Owned: " + numberOfShares;
    }
}
