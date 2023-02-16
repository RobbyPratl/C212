import java.util.ArrayList;

public class Q1 {
    public static int[] distinct(ArrayList<Integer> list) {
        ArrayList<Integer> distinct = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (!distinct.contains(list.get(i))) {
                distinct.add(list.get(i));
            }
        }
        int[] distinctArray = new int[distinct.size()];

        for (int i = 0; i < distinct.size(); i++) {
            distinctArray[i] = distinct.get(i);
        }
        return distinctArray;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(5);

        int[] distinct = distinct(list);
        for (int i = 0; i < distinct.length; i++) {
            System.out.println(distinct[i]);
        }
    }

}