import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int count = in.nextInt();
        int sum = 0;
        int num = 2;
        int count1 = 0;
        while (count1 < count) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
                count1++;
            }
            num++;
        }
        System.out.println("Sum of first " + count + " prime numbers is: " + sum);
    }
}
