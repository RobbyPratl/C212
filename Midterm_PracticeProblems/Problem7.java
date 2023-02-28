public class Problem7 {

    public static void main(String[] args) {
        System.out.printf("Test 1: %s\n", reverseWords("the dark side of the moon"));
        System.out.printf("Test 2: %s\n", reverseWords("seventh son of the seventh son"));
    }

    private static String reverseWords(String s) {
        // You could do this with an ArrayList...
        String[] res = s.split(" ");
        String resStr = "";
        for (int i = res.length - 1; i > 0; i--) {
            resStr += res[i] + " ";
        }
        return resStr + res[0];
    }
}
