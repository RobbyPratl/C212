import java.util.Scanner;

public class P3 {
    public static int getRomanLetterValue(String roman) {
        int value = 0;
        if (roman.equals("I")) {
            value = 1;
        } else if (roman.equals("V")) {
            value = 5;
        } else if (roman.equals("X")) {
            value = 10;
        } else if (roman.equals("L")) {
            value = 50;
        } else if (roman.equals("C")) {
            value = 100;
        } else if (roman.equals("D")) {
            value = 500;
        } else if (roman.equals("M")) {
            value = 1000;
        }
        return value;
    }

    public static int convertRomantoDeciaml(String roman) {
        int decimal = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int current = getRomanLetterValue(roman.substring(i, i + 1));
            if (current < prev) {
                decimal -= current;
            } else {
                decimal += current;
            }
            prev = current;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a roman number: ");
        String roman = in.nextLine();
        System.out.println(convertRomantoDeciaml(roman));
        in.close();
    }
}
