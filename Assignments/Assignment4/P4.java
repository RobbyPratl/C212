import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your new password: ");
        String pass1 = in.next();
        System.out.println("Enter your new password agian:");
        String passR1 = in.next();
        String a = checkReq(pass1);
        String b = checkMatch(pass1, passR1);
        if (a == b) {
            System.out.println(a);
        } else {
            System.out.println("Your password is invalid, please try agian.");
        }

    }

    public static String checkMatch(String pass, String passRe) {
        String invalid = "Your password is invalid, please try agian.";
        String valid = "Your password is set. Thank You.";

        char[] arrPass = new char[pass.length() + 1];
        for (int i = 0; i < pass.length(); i++) {
            arrPass[i] = pass.charAt(i);
        }
        char[] arrpassR1 = new char[passRe.length() + 1];
        for (int i = 0; i < passRe.length(); i++) {
            arrpassR1[i] = passRe.charAt(i);
        }

        if (pass.length() != passRe.length()) {
            return invalid;
        }
        for (int i = 0; i < passRe.length(); i++) {
            if (arrPass[i] != arrpassR1[i]) {
                return invalid;
            }

        }

        return valid;

    }

    public static String checkReq(String pass) {
        String invalid = "Your password is invalid, please try agian.";
        String valid = "Your password is set. Thank You.";

        char[] arrPass = new char[pass.length() + 1];
        for (int i = 0; i < pass.length(); i++) {
            arrPass[i] = pass.charAt(i);
        }
        int reqChar = 8;
        int reqUpper = 1;
        int reqLower = 1;
        int reqDigit = 1;
        for (int i = 0; i < pass.length(); i++) {
            if ((Character.isUpperCase(arrPass[i]))) {
                reqUpper--;
                reqChar--;
            } else if (Character.isLowerCase(arrPass[i])) {
                reqLower--;
                reqChar--;
            } else if (Character.isDigit(arrPass[i])) {
                reqDigit--;
                reqChar--;
            } else {

            }

        }
        if (reqLower > 0) {
            return invalid;
        } else if (reqUpper > 0) {
            return invalid;
        } else if (reqChar > 0) {
            return invalid;
        } else if (reqDigit > 0) {
            return invalid;
        } else {
            return valid;
        }

    }
}
