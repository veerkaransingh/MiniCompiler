package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListlearn {
    public static void main(String[] args) {
        System.out.println("Lets learn about linked list!!!!");
        // array list
        //ArrayList<Integer> list1 = new ArrayList<>(1000);
        // O[1] = Cost for insertion in
        //link list
        // three parts, the value itself, pervious reference, next reference
        LinkedList<Integer> l1 = new LinkedList<>(); //initialised an arraylist consisting integers -- new array
        // collections can only hold integer objects, not primitive type int
        LinkedList<Integer> l2 = new LinkedList<>();
        // can't give initial capacity to a linked list

        // Adding elements to linked list no 2
        l2.add(33);
        l2.add(11);
        l2.add(22);
        l2.add(44);
        l2.add(55);

        // Adding elements to linked list no 1
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(2);

        // Adding an element at the end of this linked list
        l1.addLast(99);

        // Adding an element at the start of this linked list
        l1.addFirst(1);


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
