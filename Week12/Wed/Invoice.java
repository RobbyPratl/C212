package Week12.Wed;

import java.util.ArrayList;

public class Invoice {
    private Address address;
    private ArrayList<LineItem> lineItems;

    public Invoice() {
        this.lineItems = new ArrayList<LineItem>();
    }

    public Invoice(Address address) {
        this.address = address;
    }

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public double computeAmountDue() {
        double amountDue = 0;
        for (LineItem l : lineItems) {
            amountDue += l.computeTotal();
        }
        return amountDue;
    }

    public String format() {
        String str = "";
        str += "\t\t\tINVOICE\n";
        str += address.format();
        str += "\n";
        str += "Description\t\tPrice\tQuantity\tTotal\n";
        for (LineItem l : lineItems) {
            str += l.format();
        }
        str += "AMOUNT DUE: $";
        str += computeAmountDue();
        return str;
    }

}
