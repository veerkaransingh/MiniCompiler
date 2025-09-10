package Exception_handling;


public class FinallyBlock {
    public static int greet(){
        try{
            int a = 50; // tried int a = 5
            int b = 2; // tried int b = 0
            int c = a/b; // try to divide
            return c;
        } catch (Exception e){  // catches an exception
            System.out.println(e); // prints that exception
        }
        finally {
            System.out.println("Cleaning up resources: This is the end of this function ");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            } catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
    }
}
