import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the word:");
        String word = in.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i, word.length()));

        }
    }
}
