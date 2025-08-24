package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);


        for(Integer i:list){
            System.out.println(i);
        }

        System.out.println("Java 8");
        list.stream().forEach(i -> System.out.println(i));

        System.out.println("\nJava 8");
        list.stream().sorted().forEach(integer -> System.out.println(integer));
    }
}
