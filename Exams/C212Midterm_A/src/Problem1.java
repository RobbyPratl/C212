import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1 {

    public static boolean isEven(int n) {

        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // add the filename
        try {
            File inputFile = new File("C212Midterm_A/files/file1-1.txt");
            Scanner in = new Scanner(inputFile);

            // declare and initialize variables if needed
            while (in.hasNextInt()) {
                int n = in.nextInt();
                if (isEven(n))
                    System.out.println(n + " is even");
                else
                    System.out.println(n + " is odd");
            }

            // display the results

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
