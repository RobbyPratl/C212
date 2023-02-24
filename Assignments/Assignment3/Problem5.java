import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int num1 = num;
        int num2 = 0;
        while (num1 > 0) {
            int rem = num1 % 10;
            num2 = num2 * 10 + rem;
            num1 /= 10;
        }
        if (num == num2) {
            System.out.println("Output: " + num2 + " is a palindrome");
        } else {
            System.out.println("Output: " + num2 + " is not a palindrome");
        }
        in.close();

    }
}
