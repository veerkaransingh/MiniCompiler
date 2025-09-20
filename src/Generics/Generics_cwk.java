package Generics;
import java.util.ArrayList;
import java.util.Scanner;

class MyGenerics<T1>{
    int val = 344;
    private T1 t1;
    public MyGenerics(int val, T1 t1){
        this.val = val;
        this.t1 = t1;
    }
    public int getVal(){
        return val;
    }

    public void setVal(int val){
        this.val = val;
    }
    public T1 getT1(){
        return t1;

    }
    public void setT1(T1 t1){
        this.t1 = t1;
    }
}


public class Generics_cwk {
    public static void main(String[] args) {
        // generics tell ke kis class ka object we want to keep in this array list, integers in this case
        ArrayList <Integer> arraylist = new ArrayList();

       // arraylist.add("Str 1"); // can't store a string in the arraylist
        arraylist.add(54);
        arraylist.add(643);
       // arraylist.add(new Scanner(System.in));
        //int a = (int) arraylist.get(2);

        MyGenerics <String> g1 = new MyGenerics(23,"myString");
        String str = g1.getT1();
        System.out.println(str);
    }
}
