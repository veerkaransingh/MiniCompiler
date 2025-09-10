package Exception_handling;

        //  Difference between throw and throws
        // throw -- exit the program right away if there is any error
// throws -- just a warning that an exception can be there, so be prepared with a try catch block!!!!

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius can not be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Throw_throws {

    public static double area (int r) throws NegativeRadiusException{ // in case, somebody inputs negative number for radius, we have to create a custom exception
        if(r<0){
            throw new NegativeRadiusException(); // throw keyword is used to throw an exception
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
            // made by karan
        int result = a/b;
        return result;
        }
    public static void main(String[] args) {
            //Aav-- used divide function created by karan
        try{
           // int c = divide(6,0);
            //System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }catch (Exception e){
            System.out.println("Exception");
        }



    }
}
