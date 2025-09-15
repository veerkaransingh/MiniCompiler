package Collections;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Date;
import java.util.Calendar;


public class Problems {
    public static void main(String[] args) {
        // Problem no 1
        ArrayList <String> ar = new ArrayList<>();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object o :ar){ // for every object in this array list
            System.out.println(o);
        }


        // Problem no 1 part 2
        HashSet<Integer> s = new HashSet<>(); // It implements Set interface (Abstract), we can't instantiate Set directly.
        s.add(5);
        s.add(8);
        s.add(23);
        s.add(2);
        s.add(3);
        System.out.println(s);  // will print the set


        // Problem no 2 using date class
        Date d = new Date();
        System.out.println(d.getHours() + ":" +d.getMinutes() + ":" + d.getSeconds());

        // Problem no 3. using Calendar class
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":" +c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));



    }
}
