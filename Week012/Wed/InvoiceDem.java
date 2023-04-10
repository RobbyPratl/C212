package Week012.Wed;

public class InvoiceDem {
    public static void main(String[] args) {
        String name = "Sam Snall Nails";
        String street = "501 N Sunrise";
        String city = "Bloomington";
        String state = "Indiana";
        String zip = "47606";

        Invoice invoice = new Invoice(new Address(name, street, city, state, zip));
        invoice.addLineItem(new LineItem(new Item("Balls", 24.50), 1));
        invoice.addLineItem(new LineItem(new Item("Shoes", 214.50), 2));

        System.out.println(invoice.format());

    }
}
