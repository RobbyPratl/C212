import java.util.ArrayList;
import java.util.List;

// This is just the "merge" part of the merge sort algorithm.
// Curious students may look into this!
public class Problem10 {

    public static void main(String[] args) {
        System.out.printf("Test 1: %s", merge(new ArrayList<>(List.of(1, 4, 9, 16)),
                                              new ArrayList<>(List.of(9, 7, 4, 9, 11))));
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean aE = false;
        boolean bE = false;
        int remIdx = -1;
        int i = 0;
        while (true) {
            if (i >= a.size()) {
                aE = true;
            } else if (i >= b.size()) {
                bE = true;
            }

            if (aE || bE) {
                remIdx = i;
                break;
            }

            result.add(a.get(i));
            result.add(b.get(i));
            i++;
        }

        if (aE) {
            for (int k = remIdx; k < b.size(); k++) {
                result.add(b.get(k));
            }
        } else {
            for (int k = remIdx; k < a.size(); k++) {
                result.add(a.get(k));
            }
        }
        
        return result;
    }
}
