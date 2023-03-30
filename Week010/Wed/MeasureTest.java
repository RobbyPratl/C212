package Week10.Wed;

public class MeasureTest {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        Country[] countries = new Country[2];

        accounts[0] = new Account(1000, 1000);
        accounts[1] = new Account(1100, 2000);

        countries[0] = new Country("France", 190290);
        countries[0] = new Country("Germany", 919230);
    }

    public static double computeAvg(Measureable[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            // sum += m[i].getMeasure(); need to add fixtures
        }
    }
}
