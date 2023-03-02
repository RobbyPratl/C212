import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.InputMap;

public class M1 {
    // This is will be practice on ArrayList because I cannot understand them
    public static void readList(Array<String> list) {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String names = in.nextLine();
        while (names != "q") {
            list.add(names);
        }
        System.out.println("Did you mess up on the inivitation?");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == notInvited) {
                list.remove(i);
                System.out.println("You are not invited");
            }
        }

    }
}
