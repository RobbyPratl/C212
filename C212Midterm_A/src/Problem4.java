import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem4 {

    public static int countRepeatingCharacters(String str) {
        // check then a character is repeated
        // if it is repeated, count it
        // return the count
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {

        // add the downloaded filename
        File inputFile = new File("files/file3-1.txt");
        Scanner in = new Scanner(inputFile);

        // declare and initialize variables if needed

        while (in.hasNextLine()) {

            String line = in.nextLine();
            // implement the method
            System.out.println(countRepeatingCharacters(line));
        }

        in.close();

        // print the output
    }
}
