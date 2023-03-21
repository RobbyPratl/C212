public class BankAccount {
    int accounts;
    double balance;

    public int getAccounts() {
        return accounts;
    }

    public void setAccounts(int accounts) {
        this.accounts = accounts;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [accounts=" + accounts + ", balance=" + balance + "]";
    }

}
