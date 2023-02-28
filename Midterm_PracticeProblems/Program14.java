import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program14 {

    public static void main(String[] args) {
        Scanner file = null;
        try {
            file = new Scanner(new File("input/p14.txt"));
        } catch (FileNotFoundException fnfe) {
            throw new RuntimeException(fnfe);
        }

        // Read integers from file. If positive, add to sum.
        boolean isEmpty = true;
        int sum = 0;
        while (file.hasNext()) {
            isEmpty = false;
            String next = file.nextLine();
            if (isPositiveInteger(next)) {
                sum += Integer.parseInt(next);
            } else {
                throw new IllegalArgumentException("Input is a non-number!\n");
            }
        }
        file.close();

        // If the file was empty, throw exception.
        if (isEmpty) {
            throw new RuntimeException("File is empty!");
        } else {
            System.out.println(sum);
        }
    }

    // There are a gajillion ways to parse numbers from Strings or
    // determine if a String represents a number. This is a very primitive
    // check that just determines if it contains digits.
    private static boolean isPositiveInteger(String n) {
        for (char ch : n.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }
}
