package Collections;
import java.util.*; // imported everything
import java.lang.reflect.Array;

public class arrayList {
    public static void main(String[] args) {
       ArrayList<Integer> l1 = new ArrayList<>(); //initialised an arraylist consisting integers -- new array
        // collections can only hold integer objects, not primitive type int
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(33);
        l2.add(11);
        l2.add(22);
        l2.add(44);
        l2.add(55);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(2);
        l1.add(0,5);
        l1.set(0,566); // what you would like to store at specified index
        l1.addAll(0,l2); // added elements of l2 to l1 starting from zero, append -- adds from end
        System.out.println(l1.contains(8)); // does list contains this element or not
        System.out.println(l1.indexOf(6));
        for (Integer integer : l1) {
            System.out.print(integer);
            System.out.print(" , ");
        }
    }
}
