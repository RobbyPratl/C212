import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the cost of your groceries: ");
        double spending = in.nextDouble();
        double discount;
        if (10 < spending && spending < 60) {
            discount = spending * .08;
            System.out.printf("%s%.2f", "You win a discount coupon of $", discount);
            System.out.println(". (10% of your purchase)");
        } else if (60 < spending && spending < 150) {
            discount = spending * .1;
            System.out.printf("%s%.2f", "You win a discount coupon of $", discount);
            System.out.println(". (10% of your purchase)");
        } else if (150 < spending && spending < 210) {
            discount = spending * .12;
            System.out.printf("%s%.2f", "You win a discount coupon of $", discount);
            System.out.println(". (10% of your purchase)");
        } else if (210 < spending) {
            discount = spending * .14;
            System.out.printf("%s%.2f", "You win a discount coupon of $", discount);
            System.out.println(". (10% of your purchase)");
        } else {
            System.out.println("No coupon");
        }

    }
}
