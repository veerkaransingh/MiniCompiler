package Collections;

import java.util.HashMap;

public class Hasing_Revise {
    public static void main(String[] args) {
        // hashing is a technique of converting data (like a String, object, or number) into a fixed size value called a hash code.
        // Java's hashCode() method generates an interger hash code for an object
        // Then that hash code is converted to an index of array ( called a bucket)
        // Chaining ..... Openaddressing  when two objects got same hash code
        // hash based data structures include hashmap, hashtable, hashset
        // lets create a new hash map with integer as keys and String as values
        HashMap<Integer,String> map1 = new HashMap<>();

        map1.put(1,"Karan"); // storing data in a map, key = 1, value = Karan
        map1.put(2,"Apple"); // stored in a different place(bucket) decided by the hash code of 2
        System.out.println(map1.get(2));


    }
}
