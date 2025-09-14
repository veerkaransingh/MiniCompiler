package Collections;
import java.util.Calendar;

public class Calenderclass {
    // calendar Class is an abstract class but has one static method
    public static void main(String[] args) {
        //Calendar c = Calendar.getInstance();
        //System.out.println(c.getCalendarType());
        //gregorian calendar, which the entire world follows
        //System.out.println(c.getTimeZone());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone().getID());
        // will return America/Toronto
    }
}
