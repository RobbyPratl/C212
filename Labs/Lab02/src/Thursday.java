import java.util.Scanner;

public class Thursday {
    public static void main(String[] args) {
        // Exercise1
        final double width = 215.9;
        final double length = 279.4;
        System.out.println();
        System.out.println("Width: " + width + " in");
        System.out.println("length: " + length + " in");
        double perimeter = width + length + length + width;
        System.out.printf("Perimeter: %.1f", perimeter);
        double totalAB = Math.pow(length, 2) + Math.pow(width, 2);
        double diagonalMeasure = Math.sqrt(totalAB);
        System.out.println();
        System.out.printf("Length of Diagonal: %.1f", diagonalMeasure);
        System.out.println();

        // Exercise2
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter your first interger");
        int firstInt = in.nextInt();
        System.out.println("Please enter your second interger");
        int secInt = in.nextInt();
        int sum = firstInt + secInt;
        int max = Math.max(firstInt, secInt);
        int min = Math.min(firstInt, secInt);
        int difference = max - min;
        int distance = Math.abs(difference);
        int product = firstInt * secInt;
        float avgNum = sum / 2;
        System.out.printf("%-8s%8d\n", "Sum:", sum);
        System.out.printf("%-8s%5d\n", "Difference:", difference);
        System.out.printf("%-8s%8d\n", "Product:", product);
        System.out.printf("%-8s%11.2f\n", "Avg:", avgNum);

        // System.out.printf("%-8s%8d\n", "Average:", avgNum);
        System.out.printf("%-8s%6d\n", "Distance: ", distance);
        System.out.printf("%-8s%8d\n", "Maximum:", max);
        System.out.printf("%-8s%8d\n", "Minimum:", min);
        System.out.println();
        // Execrise3
        String emailUser = "uzrivera@iu.edu";
        int atMail = emailUser.indexOf("@");
        String userName = emailUser.substring(0, atMail);
        System.out.println("User Name: " + userName);
        System.out.println();
        // Execrise4
        String daysOfWeek = "SunMonTueWedThuFriSat";
        System.out.println("Please enter the day number");
        int dayNum = in.nextInt();
        int start = 3 * dayNum;
        String dayName = daysOfWeek.substring(start, start + 3);
        System.out.println("Day Name: " + dayName);
        System.out.println();

    }
}
