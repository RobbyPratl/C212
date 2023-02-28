public class Problem4 {

    public static void main(String[] args) {
        System.out.printf("Test 1: %s\n", alarmClock(1, false));
        System.out.printf("Test 2: %s\n", alarmClock(5, false));
        System.out.printf("Test 3: %s\n", alarmClock(0, false));
        System.out.printf("Test 4: %s\n", alarmClock(1, true));
        System.out.printf("Test 5: %s\n", alarmClock(5, true));
        System.out.printf("Test 6: %s\n", alarmClock(0, true));
    }

    private static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day == 0 || day == 6) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }
}
