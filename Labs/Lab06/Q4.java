import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 {
    public static void readFile() throws FileNotFoundException {
        Scanner file = new Scanner(new File("Labs/Lab06/Q4.txt"));
        int lines = 0;
        int words = 0;
        int chars = 0;
        while (file.hasNextLine()) {
            lines++;
            String line = file.nextLine();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                words++;
                String word = lineScanner.next();
                chars += word.length();
            }
            lineScanner.close();
        }
        file.close();
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Chars: " + chars);
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

}
