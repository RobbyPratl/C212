import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// There are two ways to interpret this problem: the first is to simply read
// values into an ArrayList and convert that to an array. The other is to use an array
// from the start,read the file TWICE since we can't resize arrays (easily). Both solutions are presented.
public class Program15 {

    public static void main(String[] args) {
        easyRead("input/p15.txt");
        hardRead("input/p15.txt");
    }

    private static void easyRead(String fileName) {
        Scanner file = null;
        try {
            file = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        // Read values into ArrayList.
        ArrayList<Integer> nums = new ArrayList<>();
        while (file.hasNext()) {
            nums.add(file.nextInt());
        }
        file.close();

        // Convert into array.
        int[] numsArray = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            numsArray[i] = nums.get(i);
        }

        System.out.println(uniqueSum(numsArray));
    }

    private static void hardRead(String fileName) {
        Scanner file = null;
        try {
            file = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        // First, read the number of lines.
        int numLines = 0;
        while (file.hasNext()) {
            file.nextLine();
            numLines++;
        }
        file.close();

        // Reopen the file and get the integers.
        file = null;
        try {
            file = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        int[] nums = new int[numLines];
        for (int i = 0; file.hasNext(); i++) {
            nums[i] = file.nextInt();
        }
        file.close();

        System.out.println(uniqueSum(nums));
    }

    private static int uniqueSum(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int n : arr) {
            if (!nums.contains(n)) {
                nums.add(n);
            }
        }

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }
}
