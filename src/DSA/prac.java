package DSA;

import java.util.Arrays;
import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5]; // Array of integer objects
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
        //[11, 22, 33, 44, 55]
        System.out.println(arr[3]);

        //input using for loops
        for(int i = 0; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr)); // toString is a method of Arrays class, when we pass integer array, it will convert it to string array

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // to print every element after all elements have been inserted into this array
        }

        // For each - enhanced loop
        for(int num : arr) { // for every element present in this array, print that element
            System.out.print(num);
        }

         //

     }
}
