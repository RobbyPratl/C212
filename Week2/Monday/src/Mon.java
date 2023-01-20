import java.util.Scanner;

public class Mon {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Please enter first name");
            String firstName = in.next();
            System.out.println("Please enter middle name");
            String middleName = in.next();
            System.out.println("Please enter last name");
            String lastName = in.next();
            char initial = firstName.charAt(0);
            char middleI = middleName.charAt(0);
            System.out.println(lastName + " " + middleI + ". " + initial + ". ");
        }
    }
}
