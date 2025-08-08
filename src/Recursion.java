public class Recursion {

    public static int factorial(int n){
        if( n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1); // function calling itself again with n-1 as it parameter
        }
    }
    public static int iterativefactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i = 1; i <=n ; i++){ // we are basically running a for loop, starting from i =1 to n,
                product*= i;// multiply and assign!!!

            }
            return product;
        }


    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The factorial of number "+n+ " is: " + factorial(n));
        System.out.println("The factorial of number "+n+ " is: " + iterativefactorial(n));

    }
}
