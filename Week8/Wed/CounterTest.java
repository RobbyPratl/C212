public class CounterTest {
    public static void main(String[] args) {

        // created an object from the counter class
        // the blueprint
        counter tallyCounter = new counter();
        counter concertCounter = new counter();

        // Adding the counter twice
        tallyCounter.incrememnt();
        tallyCounter.incrememnt();

        System.out.println("The current count is " + tallyCounter.getCount());

        concertCounter.incrememnt();
        concertCounter.incrememnt();
        concertCounter.incrememnt();
        concertCounter.incrememnt();

        System.out.println("Concert counter current " + concertCounter.getCount());

        concertCounter.reset();

        System.out.println("Concert counter current " + concertCounter.getCount());

    }
}