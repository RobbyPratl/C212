public class ReadableFormatter implements NumberFormatter {
    public String format(int n) {
        String s = Integer.toString(n);
        String result = "";
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result = s.charAt(i) + result;
            count++;
            if (count == 3 && i != 0) {
                result = "," + result;
                count = 0;
            }
        }
        return result;
    }
}
