import java.util.Scanner;

// Checks an input to see if it's a valid integer.
// Valid numbers include optional signs +/- followed by digits.
// Probably not necessary to include the sign, but...
public class Problem11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        String n = in.nextLine();
        if (n.isEmpty()) {
            throw new IllegalArgumentException("ERR: input is empty");
        } else {
            boolean sign = n.charAt(0) == '+' || n.charAt(0) == '-';
            // If the input is ONLY a sign.
            if ((!Character.isDigit(n.charAt(0)) || sign) && n.length() == 1) {
                throw new ClassCastException("ERR: input is not number\n");
            } else {
                // Now check rest of number.
                for (int i = 1; i < n.length(); i++) {
                    char ch = n.charAt(i);
                    if (!Character.isDigit(ch)) {
                        throw new ClassCastException("ERR: input is not number\n");
                    }
                }
            }
        }
    }
}
