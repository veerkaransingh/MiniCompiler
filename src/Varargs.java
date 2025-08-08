public class Varargs {
   // static int sum(int a ,int b){
    //    return a+b;
  //  }
    public static int sum(int ...arr){ // put all the arguments into an array
        //available as int[] arr.
        int result = 0;
        for(int a: arr) { //for element a in arr array..
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("weelcome to varagrs tutorial");
        System.out.println(" the sum of a and b is: "+ sum(3,4));
        System.out.println("the sum of 3, 2, 12 and 23 is: " + sum(3,23,132,233));
        System.out.println(" the sum of 2 ,3 1 ,1 ,2 is: "+ sum(3, 3,  2, 2, 2, 2,2));
    }
}
