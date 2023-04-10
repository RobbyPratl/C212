package Week1.Wednesday.src;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Please enter number of bottles");
            int bottles = in.nextInt();
            System.out.println("Please enter price");
            double price = in.nextDouble();
            double subTotal = price * bottles;
            System.out.println("Your subtotal is $" + subTotal);
            System.out.println("Tax $" + (subTotal * 0.07));
            double total = subTotal + (subTotal * 0.07);
            System.out.println("Your total is $" + total);
        }

    }
}
