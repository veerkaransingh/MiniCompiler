package Exception_handling;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        //syntax errors
        // int a = 3 -- no semicolon
        // b  = 4; -- b has not been declared


        //logical error demo
        // IDE can't help in this issue, our logic is wrong
        // print prime numbers between 1 and 10
        System.out.println(2);
        for(int i = 1 ; i < 5; i++){ // start with i = 1
            System.out.println(2*i+1); // 9 will be there in output but that is not a prime number
        }

        // Runtime error  - program was tested , but a wrong input is provided, which is an exception
        int k ;

        Scanner sc = new Scanner(System.in); // Scanner class ka object
        k = sc.nextInt();
        System.out.println("integer part of 1000 divided by k is "+ 1000/k);


    }
}
