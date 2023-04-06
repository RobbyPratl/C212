package Week12.Wed;

public class LineItem {
    Item item;
    int quantity;

    public LineItem(Item item2, double d) {
        this.item = item2;
        this.quantity = d;
    }

    public double computeTotal() {
        return item.getPrice() + this.quantity;
    }

    public String format() {
        String str = "";
        str += item.getName() + "\t\t" + item.getPrice() + "\t" + quantity + "\t" + computeTotal();
        return str;
    }
}
