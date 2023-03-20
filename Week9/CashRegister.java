/**
 * A simulated cash register that tracks the item count
 * and the total amount due
 */

public class CashRegister {

    // instance variables
    private int count;
    private double total;
    private int invoiceNo;

    private static int lastInvoiceNo = 10000;

    // constructor
    public CashRegister(){
        count = 0;
        total = 0;
        invoiceNo = lastInvoiceNo++;
        //this(0, 0);
    }

    public CashRegister(int c, double t){
        count = c;
        total = t;
        invoiceNo = lastInvoiceNo++;
    }

    public CashRegister(int c, double t, int i){
        count = c;
        total = t;
        invoiceNo = i;
    }

    /**
     * adds an item's price to the current sale
     * @param price
     */
    public void addItem(double price){
        count++;
        total += price;
    }

    /**
     * get the amount due
     * @return
     */
    public double getTotal(){
        return total;
    }

    /**
     * get the no of item in the current sale
     * @return
     */
    public int getCount(){
        return count;
    }

    /**
     * resets the cash register for the next sale
     */
    public void clear(){
        count = 0;
        total = 0;
    }

    public void setCount(int c){
        count = c;
    }

    public int getInvoiceNo(){
        return invoiceNo;
    }
}
