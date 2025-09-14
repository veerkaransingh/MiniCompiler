package Collections;
import java.util.Calendar;
import java.util.Date;

public class Dateandtime {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE); // to print max value of long - a primitive data type
        // no of years passed since 1970

        // Java assumes 1900 as the start year
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());// returns the milliseconds which have passed since jan 1 1970
        System.out.println(d.getDate());// returns the date of month
        System.out.println(d.getDay()); // returns day of the week,


    }
}
