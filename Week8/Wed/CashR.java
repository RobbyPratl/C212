public class CashR {
    private double total;
    private int count;
    private int invoiceNum;
    private static int lastInvoiceNum = 1000;

    public CashR() {
        // invoiceNum = lastInvoiceNum++;
        this(0, 0);
    }

    public CashR(int c, double t) {
        count = c;
        total = t;
        invoiceNum = lastInvoiceNum++;
    }

    public CashR(int c, double t, int i) {
        count = c;
        total = t;
        invoiceNum = i;
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

    public int getInvoice() {
        return invoiceNum;
    }

}
