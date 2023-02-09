public class Wed {

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i);
        }
    }

    public static void printStringArray(String[] a) {
        for (String i : a) {
            System.out.println(i);
        }
    }

    public static double average(int[] a) {

        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        double avg = (double) sum / a.length;
        return avg;
    }

    public static double findMax(int[] a) {

        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static boolean findGrammayWinner(String[] grammys, String artists) {
        boolean found = false;

        for (String winner : grammys) {
            if (winner.equalsIgnoreCase(artists)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static int[] copyArray(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];

        }
        return b;
    }

    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = { 1, 2, 3, 4, 5 };

        array1[0] = 100;
        array1[9] = 100;

        // array1[array1.length - 1] = 100;
        // System.out.println("For i loop");
        // for (int i = 0; i < array2.length; i++) {
        // array2[i]++;
        // System.out.println(array2[i]);
        // }

        // System.out.println("For e loop");
        // for (int i : array2) {
        // i++;
        // System.out.println(i);
        // }

        // printArray(array1);
        // System.out.println(findMax(array2));

        // String[] grammayWinners = { "Harry Styles", "Ozzy Osbourne", "Lizzo",
        // "Kendrick Lamar" };
        // // printStringArray(grammayWinners);
        // String artist = "Lizzo";
        // boolean found = findGrammayWinner(grammayWinners, artist);
        // if (found) {
        // System.out.println(artist);
        // } else {
        // System.out.println(artist + " didn't win");
        // }
        printArray(array2);
        int[] array3 = copyArray(array2);
        array3[3] = 300;
        printArray(array2);
        printArray(array3);

    }
}
