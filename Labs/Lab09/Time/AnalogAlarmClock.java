import java.util.Date;

public class AnalogAlarmClock extends AlarmClock {
    public void wakeMeUp() {
        System.out.println("Brrring brrring!");
    }

    public String readTime() {
        return new Date().toString().substring(11, 19);
    }
}
