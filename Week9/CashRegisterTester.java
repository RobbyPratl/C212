public class CashRegisterTester {

    public static void main(String[] args) {

        CashRegister register1 = new CashRegister();

        // add items to cash register
        register1.addItem(5.8);
        register1.addItem(15.8);
        register1.addItem(57.65);

        System.out.println("No of items in the current sale " + register1.getCount());
        System.out.println("Total ammount due " + register1.getTotal());

        register1.clear();

        register1.setCount(10);

        System.out.println("No of items in the current sale " + register1.getCount());
        System.out.println("Invoice no = " + register1.getInvoiceNo());

        CashRegister register2 = new CashRegister();

        register2.addItem(15.9);
        register2.addItem(100.8);

        System.out.println("No of items in the current sale " + register2.getCount());
        System.out.println("Invoice no = " + register2.getInvoiceNo());

    }
}
