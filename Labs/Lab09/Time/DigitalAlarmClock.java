import java.util.Date;

public class DigitalAlarmClock extends AlarmClock {
    public void wakeMeUp() {
        System.out.println("Beep beep!");
    }

    public String readTime() {
        return new Date().toString().substring(11, 19);
    }
}
