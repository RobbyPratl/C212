import java.util.Scanner;

public class Ex1 {
    // Exercise 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int num = in.nextInt();

        float sum = 0;
        boolean firstItem = true;
        int max = 0;
        int min = 0;

        for (int i = 0; i < num; i++) {
            int temp;
            if (firstItem) {
                System.out.print("Enter " + num + " numbers: ");
                temp = in.nextInt();
                firstItem = false;
                max = temp;
                min = temp;
            } else {
                temp = in.nextInt();
            }
            sum += (double) temp;
            max = Integer.max(max, temp);
            min = Integer.min(min, temp);
        }
        System.out.println("Mean: " + sum / num);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);

    }
}
