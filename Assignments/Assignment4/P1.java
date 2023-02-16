import java.util.Scanner;

public class P1 {

    public static boolean allTheSame(int x, int y, int z) {
        if (x == y && y == z && x == z) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean allDifferent(int x, int y, int z) {
        if (x != y && y != z && x != z) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean sorted(int x, int y, int z) {
        if (x <= y && y <= z) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three interger values:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println("allTheSame: " + allTheSame(num1, num2, num3));
        System.out.println("allDifferent: " + allDifferent(num1, num2, num3));
        System.out.println("Sorted: " + sorted(num1, num2, num3));

        in.close();
    }
}
