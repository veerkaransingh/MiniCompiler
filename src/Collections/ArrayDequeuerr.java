package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;

// ArrayDequeue implements Deque interface
public class ArrayDequeuerr {

    //array dequeue -- double ended queue
    public static void main(String[] args) {

        // performing insertions and deletions over an array
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        // Adding elements to an ArrayDequeue
        ad1.add(6);
        ad1.add(7);

        System.out.println(ad1.getFirst()); // will print the first element
        System.out.println(ad1.getLast());  // will print the last element

    }
}
