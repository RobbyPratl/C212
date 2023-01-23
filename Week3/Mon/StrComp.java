public class StrComp {
    public static void main(String[] args) {
        // String str1 = "Year of the Rabbit";
        // String str2 = "Year of the Rabbit";
        // String str3 = "Year of the Rabbit";
        // if (str3.equals(str1)) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        String str5 = new String("ABC");
        String str6 = new String("BCD");
        if (str5.compareTo(str6) < 0) {
            System.out.println(str5 + " Comes before " + str6);
        } else if (str6.compareTo(str5) < 0) {
            System.out.println(str6 + " Comes before " + str5);
        } else {
            System.out.println("Nothing");
        }
    }
}
