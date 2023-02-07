import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter a number");
        int input = in.nextInt();
        if (input == 0) {
            System.out.println("Output: 0");
        } else if (input == 1) {
            System.out.println("Output: 1");
        } else {
            for (int i = 0; i < input; i++) {
                System.out.println(i);
            }
            System.out.println(sum);
        }

    }
}
