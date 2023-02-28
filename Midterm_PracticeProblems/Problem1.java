import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Test 1: ");
        breakNumber(456);

        System.out.println("\n\nTest 2: ");
        breakNumber(1234);

        System.out.println("\n\nTest 3: ");
        breakNumber(101);

        System.out.println("\n\nTest 4: ");
        breakNumber(8);
    }

    private static void breakNumber(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        // Push numbers to list.
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        // Pop them in reverse.
        while (!digits.isEmpty()) {
            System.out.println(digits.remove(digits.size() - 1));
        }
    }
}
