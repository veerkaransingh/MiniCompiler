package Exception_handling;

import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {
        //problem 1: demonstrate syntax, logical, runtime
        //syntax error - int a = 7
        // logical error
        int age = 78;
        int years = 2000 - 78;
        //   System.out.println(6/0);

        // problem 2 : print ha ha and he he
        try {
            int a = 666 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("Haha");
        } catch (ArithmeticException e) {
            System.out.println("Hehe - arithmetic exception found");
        }

        //problem no 3
        //solution
        boolean flag = true;

        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int index;

        while (flag && i < 5) {
            try {
                System.out.println("enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i >=5){
            System.out.println("Maximum attempts reached");
        }
    }
}
