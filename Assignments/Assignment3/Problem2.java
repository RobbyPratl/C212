import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = in.nextLine();
        int length = word.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(word.substring(i, j));
            }
        }
        in.close();

    }
}
