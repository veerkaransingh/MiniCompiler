package Exception_handling;

import java.util.Scanner;
//custom exceptions

class MyException extends Exception{
    @Override
    public String toString(){
        return " I am toString()";
    }
    public String getMessage(){
        return " I am getMessage()";
    }

}
public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
                //throw new MyException(); // throwing an object
                throw new ArithmeticException("This is an exception"); // checked exception, don't need signature, it extends RuntimeException

                // throw keyword is used to throw an exception explicitly by programmer
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString()); //class name: custom message
                System.out.println(e); // toString will be implemented
                e.printStackTrace(); // not an error itself but will tell the error and related line of code
                System.out.println("Finished");
            }
        }
    }
}
