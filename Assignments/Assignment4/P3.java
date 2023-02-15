import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Roman Numeral: ");
        String roman = in.next();
        int num = convertRomantoDeciaml(roman);
        System.out.print("Numeral: " + num);

    }

    public static int convertRomantoDeciaml(String roman) {
        char[] arr = new char[roman.length() + 1];
        int numeral = 0;
        for (int i = 0; i < roman.length(); i++) {
            arr[i] = roman.charAt(i);
        }
        for (int i = 0; i < roman.length() + 1; i++) {
            if (arr[i] == 'I') {
                arr[i] = 1;
            } else if (arr[i] == 'V') {
                arr[i] = 5;
            } else if (arr[i] == 'X') {
                arr[i] = 10;
            } else if (arr[i] == 'L') {
                arr[i] = 50;
            } else if (arr[i] == 'C') {
                arr[i] = 100;
            } else if (arr[i] == 'M') {
                arr[i] = 1000;
            } else {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < roman.length();) {
            if (arr[i] < arr[i + 1]) {
                numeral += (arr[i + 1] - arr[i]);
                i += 2;
            } else {
                numeral += arr[i];
                i++;
            }
        }
        return numeral;
    }
}
