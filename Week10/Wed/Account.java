package Week10.Wed;

public class Account implements Measureable {
    int accountN;
    double balance;

    public Account(int accountN, double balance) {
        this.accountN = accountN;
        this.balance = balance;
    }

    public int getAccountN() {
        return accountN;
    }

    public void setAccountN(int accountN) {
        this.accountN = accountN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
