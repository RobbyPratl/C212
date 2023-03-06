import java.util.Scanner;

public class sentAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salary;
        int sum = 0;
        double avg;
        int counter = 0;

        System.out.println("Enter salary: -1 to quit");
        salary = in.nextInt();

        while (salary != -1) {
            sum += salary;
            counter++;
            salary = in.nextInt();
        }

        avg = sum / counter;
        System.out.println("Avg salary is " + avg);
        in.close();

    }

}
