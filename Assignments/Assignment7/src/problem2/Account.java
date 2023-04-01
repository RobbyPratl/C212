package problem2;

public class Account extends Customer {
    private long accountNumber;

    public Account(String name, String address, int number, long accountNumber) {
        super(name, address, number);
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String mailCheck() {
        return super.mailCheck() + "\n" + "Account Number: " + getAccountNumber();
    }

}
