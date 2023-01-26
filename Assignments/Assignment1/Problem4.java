import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("First Name");
        String firstName = in.next();
        System.out.println("Last Name");
        String lastName = in.next();
        System.out.println("Four Digit Number");
        String fourDigit = in.next();
        char firstLetter = firstName.charAt(0);
        String firstFive = lastName.substring(0, 5);
        String lastTwo = fourDigit.substring(2, 4);
        System.out.println("Your user login name: " + firstFive + firstLetter +
                lastTwo);
        System.out.println();
    }
}
