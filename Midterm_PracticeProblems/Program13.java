import java.io.*;
import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {
        Scanner file = null;
        try {
            file = new Scanner(new File(("input/p12.txt")));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // PrintWriter may or may not have been discussed, but it sure is a hell of a lot
        // easier to work with!
        PrintWriter evenFile = null;
        PrintWriter oddFile = null;
        try {
            evenFile = new PrintWriter(new FileWriter("input/p13-evens.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            oddFile = new PrintWriter(new FileWriter("input/p13-odds.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (file.hasNext()) {
            int n = file.nextInt();
            if (isEven(n)) {
                evenFile.println(n);
            } else {
                oddFile.println(n);
            }
        }

        evenFile.close();
        oddFile.close();
        file.close();
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
