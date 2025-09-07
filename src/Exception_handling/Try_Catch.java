package Exception_handling;

public class Try_Catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        try { //anything inside try will be tried once -- kosish kri jaaye ek baar atleast
            float c = a / b;  // .ArithmeticException being divided by zero

        }catch (Exception e) { // in case, any exception is there, that will be catched and printed

            System.out.println("We failed to divide. Reason: ");
            System.out.println(e); // exception will be printed

        } // will continue the remaining code
        // saves us from unexpected interruption

        System.out.println("End of the program"); // Without try catch, this will not be printed as code is being executed line by line
    }

}
