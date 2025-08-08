public class Recursion {

 /*   public static int fibbonacci(int x){
        if(x==0){
            return 0;
        } else if (x==1) {
            return 1;
        }else {
            return fibbonacci(x-1) +fibbonacci(x-2);
        }
    }

    public static void main(String[] args) {
        int count = 15;
        System.out.println("Series upto number " + count + " is: ");
        for (int i = 0; i <= count; i++) {
            System.out.print(fibbonacci(i) + " ");
        }
 /*   public static int factorial(int n){
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
    } */

    public static void starPattern(int n){ // suppose we gave n as 3 to print three lines having 1 star, 2 stars, 3 stars respectively
        if(n>0){  // ofcourse n is greater than 3, will enter to loop
            starPattern(n-1); //will first implement for n = 2
            /* logic
            will implement starPattern(2) + print 3 stars in a line as per for loop
            resolves to starPattern(1) + print 2 stars in a line + print 3 stars in a line
            resolves to starPattern(0)+ print 1 star in a line + print 2 stars in a line + print 3 stars in a line
             */
            for(int i = 0; i < n; i++ ){
                System.out.print("*");

            }
            System.out.println();// just to insert a line

        }

    }

    public static void main(String[] args) {
        System.out.println("Pattern of stars for 3 lines starting from 1");
        starPattern(3);
    }
    }



