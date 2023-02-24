import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();
        System.out.println("Enter the second number:");
        int num2 = in.nextInt();
        System.out.println("Enter the third number:");
        int num3 = in.nextInt();
        if (num1 < num2 && num2 < num3) {
            System.out.println("The numbers are increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("The numbers are decreasing");
        } else {
            System.out.println("The numbers are neither increasing nor decreasing");
        }
        in.close();

    }
}
