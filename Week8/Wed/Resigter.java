public class Resigter {
    public static void main(String[] args) {
        CashR r1 = new CashR(10, 9.6);
        r1.addItem(5);
        r1.addItem(5.63);

        System.out.println("Total " + r1.getTotal());
        System.out.println("Amount of items " + r1.getCount());

        r1.resetVar();

    }

}
