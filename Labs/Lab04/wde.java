import java.util.Scanner;

public class wde {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int sideLength = in.nextInt();
        int row = 1;
        int column = 1;

        while (row <= sideLength) {
            while (column <= sideLength) {
                if (row == 1 || row == sideLength) {
                    System.out.print("*");
                } else if (column == 1 || column == sideLength) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                column++;
            }
            System.out.println();
            row++;
            column = 1;
        }
    }
}
