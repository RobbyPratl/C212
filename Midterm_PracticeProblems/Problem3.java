public class Problem3 {

    public static void main(String[] args) {
        System.out.printf("Test 1: %s\n", frontTimes("Chocolate", 2));
        System.out.printf("Test 2: %s\n", frontTimes("Chocolate", 3));
        System.out.printf("Test 3: %s\n", frontTimes("Abc", 3));
    }

    private static String frontTimes(String s, int t) {
        String res = "";
        String sub = s.length() < 3 ? s : s.substring(0, 3);
        for (int i = 0; i < t; i++) {
            res += sub;
        }
        return res;
    }
}
