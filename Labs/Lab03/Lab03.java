import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Execrise 1
        System.out.println("Please input a number");
        float number = in.nextFloat();
        if (number == 0) {
            System.out.println("zero");
        } else {
            if (number < 0) {
                if (Math.abs(number) < 1) {
                    System.out.println("Negative small");
                } else if (Math.abs(number) > 1000000) {
                    System.out.println("Negative larger");
                } else {
                    System.out.println("Negative");
                }
            } else if (number > 0) {
                if (Math.abs(number) < 1) {
                    System.out.println("Positive small");
                } else if (Math.abs(number) > 1000000) {
                    System.out.println("Postive larger");
                } else {
                    System.out.println("Positive");
                }

            }
        }
        // Execrise 2

        System.out.println("Please enter a single character from the alphabet");
        String input = in.next();
        if (input.length() > 1) {
            System.out.println("Error: Input is not a single character");
        } else {
            char c = input.charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                System.out.println("Vowel");
            } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                System.out.println("Consonant");
            } else {
                System.out.println("Error: Input is not a letter");
            }
        }

        // Execrise 3

        System.out.println();
        System.out.println("Enter a month: ");
        int input1 = in.nextInt();
        if (input1 == 1 || input1 == 3 || input1 == 5 || input1 == 7 || input1 == 8 || input1 == 10 || input1 == 12) {
            System.out.println(31 + " days");
        } else if (input1 == 4 || input1 == 6 || input1 == 9 || input1 == 11) {
            System.out.println("28 or 29 days");
        } else {
            System.out.println("This is not a month");
        }

        // Execrise 4

        System.out.println("Input a three strings");
        String str1 = in.next();
        String str2 = in.next();
        String str3 = in.next();
        if (str1.compareTo(str2) < 0) {
            if (str2.compareTo(str3) < 0) {
                System.out.println(str1 + " " + str2 + " " + str3);
            } else if (str1.compareTo(str3) < 0) {
                System.out.println(str1 + " " + str3 + " " + str2);
            } else {
                System.out.println(str3 + " " + str1 + " " + str2);
            }
        } else {
            if (str1.compareTo(str3) < 0) {
                System.out.println(str2 + " " + str1 + " " + str3);
            } else if (str2.compareTo(str3) < 0) {
                System.out.println(str2 + " " + str3 + " " + str1);
            } else {
                System.out.println(str3 + " " + str2 + " " + str1);
            }
        }

    }
}
