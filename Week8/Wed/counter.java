public class counter {
    // Only access to this class
    private int count = 0;

    // increment method that will count by 1
    public void incrememnt() {
        count++;
    }

    // returns the INTEGER current count
    public int getCount() {
        return count;
    }

    public void reset() {
        count = 0;
    }
}
