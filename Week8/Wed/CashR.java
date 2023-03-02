public class CashR {
    private double total;
    private int count;

    public CashR() {
        count = 0;
        total = 0;
    }

    public CashR(int c, double t) {
        count = c;
        total = t;
    }

    /**
     * adds on items to current sale
     * 
     * @param price
     */
    public void addItem(double price) {
        count++;
        total += price;
    }

    public double getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public void resetVar() {
        count = 0;
        total = 0;
    }

}
