public class forLoop {
    public static void main(String[] args) {
        double balance = 10000;
        int nyears = 10;
        final double rate = 0.05;
        // final double target = 2 * balance;
        for (int year = 0; year < nyears; year++) {
            balance += balance * rate;
            System.out.println(year + 1 + " " + balance);
        }
    }
}
