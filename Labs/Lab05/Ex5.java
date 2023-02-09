public class Ex5 {
    public static void main(String[] args) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265
        };

        int win = fastestIndex(times);
        int second = secondFastestIndex(times);
        double avg = averageTime(times);
        System.out.printf("Fastest runner is %s with %d minutes %n", names[win], times[win]);
        System.out.printf("Second fastest runner: %s with %d minutes %n", names[second], times[second]);
        System.out.printf("Average time: %f %n", avg);
        allAboveAverage(times, avg, names);

    }

    public static int fastestIndex(int[] times) {
        int fastestIndex = 0;
        for (int counter = 0; counter < times.length; counter++) {

            if (times[counter] < times[fastestIndex]) {
                fastestIndex = counter;
            }
        }
        return fastestIndex;
    }

    public static int secondFastestIndex(int[] times) {
        int fastestIdx = fastestIndex(times);
        int secondFastestIdx = 0;

        for (int counter = 0; counter < times.length; counter++) {
            if (times[counter] < times[secondFastestIdx] && counter != fastestIdx) {
                secondFastestIdx = counter;
            }
        }

        return secondFastestIdx;
    }

    public static double averageTime(int[] times) {
        double avg = 0;
        for (int counter = 0; counter < times.length; counter++) {
            avg += times[counter];
        }
        avg /= times.length;
        return avg;
    }

    public static void allAboveAverage(int[] times, double avg, String[] names) {
        System.out.printf("All runners with better running time than average:%n");
        for (int counter = 0; counter < times.length; counter++) {
            if (times[counter] < avg) {
                System.out.println(names[counter]);
            }
        }
    }
}