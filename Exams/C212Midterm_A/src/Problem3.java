import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem3 {

    public static boolean hasEmail(String str) {
        if (str.contains("@"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C212Midterm_A/files/file3-1.txt");
        Scanner in = new Scanner(inputFile);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            // add your code here
            if (hasEmail(line)) {
                System.out.println(line);
            }
        }

        in.close();
    }
}
