import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int count = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        for (int i = 0; i < count; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println("Output: " + num1);
        in.close();

    }
}
