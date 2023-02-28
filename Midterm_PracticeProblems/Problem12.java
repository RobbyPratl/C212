import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem12 {

    public static void main(String[] args) {
        Scanner file = null;
        try {
            file = new Scanner(new File(("input/p12.txt")));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int currSum = 0;
        while (file.hasNext()) {
            int next = file.nextInt();
            if (getNoOfDigits(next) == 2) {
                currSum += next;
            }
        }

        file.close();
        System.out.println(currSum);
    }

    private static int getNoOfDigits(int n) {
        int noDigits = 0;
        while (n > 0) {
            noDigits += 1;
            n /= 10;
        }
        return noDigits;
    }
}
