
public class P2 {
    public static int findPostionNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3'
                    || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6'
                    || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9'
                    || str.charAt(i) == '0') {
                return i;
            }
        }
        return -1;

    }

    public static int numCompare(String str1, String str2) {
        int pos1 = findPostionNum(str1);
        int pos2 = findPostionNum(str2);
        if (pos1 == -1 && pos2 == -1) {
            return 0;
        } else if (pos1 == -1) {
            return -1;
        } else if (pos2 == -1) {
            return 1;
        } else {
            int num1 = Integer.parseInt(str1.substring(pos1));
            int num2 = Integer.parseInt(str2.substring(pos2));
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "file1";
        String str2 = "file2";
        System.out.println(numCompare(str1, str2));
    }
}
