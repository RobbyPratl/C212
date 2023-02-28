import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
        for (int i = 1; i < args.length; i++) {
            try {
                processFile(args[i], args[0]);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void processFile(String path, String word) throws FileNotFoundException {
        Scanner f = new Scanner(new File(path));
        while (f.hasNext()) {
            String line = f.nextLine();
            if (line.contains(word)) {
                System.out.printf("%s: %s\n", path, line);
            }
        }
        f.close();
    }
}
