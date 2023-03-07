package Personal_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class M1 {
    // This is will be practice on ArrayList because I cannot understand them
    public static void readList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void removePerson(ArrayList<String> list, String notInvited) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == notInvited) {
                list.remove(i);
                System.out.println("You are not invited");
            }
        }
        readList(list);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Who do you want to invite?");
        String names = in.nextLine();

        while (!names.equals("q")) {
            list.add(names);
            names = in.nextLine();
        }

        System.out.println("Did you mess up on the inivitation? (Y/N)");
        readList(list);
        String response = in.nextLine();
        if (response.equals("y")) {
            System.out.println("Who is the person that's not invited?");
            String notInvited = in.nextLine();
            removePerson(list, notInvited);
        } else if (response.equals("n")) {
            System.out.println("Here are the people invited!");
            readList(list);
        }
        in.close();

    }
}
