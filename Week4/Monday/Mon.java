public class Mon {
    public static void main(String[] args) {
        double balance = 10000;
        int year = 0;
        final double rate = 0.05;
        final double target = 2 * balance;
        while (balance < target) {
            year++;
            balance += balance * rate;
        }
        System.out.println("It took " + year + " years to double balance");
    }
}
