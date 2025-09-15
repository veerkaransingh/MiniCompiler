package javapractice;

 /*interface DemoAno {
    void meth1();
    void meth2();

}
class AnonyDemo implements DemoAno {
    public void display(){
        System.out.println("Hello");
    }
    public void meth1() {
        System.out.println("i am meth1");
    }
    public void meth2() {
        System.out.println("i am meth2");
    }
} */

import java.util.Arrays;
import java.util.List;

interface MathOperation{
    int operate(int a , int b); // created a function here in this interface
}
public class Lambda {
    public static void main(String[] args) {
     //   AnonyDemo obj = new AnonyDemo();
     //   obj.meth1();
     /*   DemoAno obj = new DemoAno() { // using Anonymous class
            @Override
            public void meth1() {
                System.out.println("meth1");

            }

            @Override
            public void meth2() {
                System.out.println("meth1");
            }
        };
        obj.meth1(); */
// lambda
        MathOperation m = (a,b) ->a+b;
        m.operate(1,2);

        List<String> names = Arrays.asList("Karan", "Veer", "Singh");

        // Using lambda with forEach
        names.forEach(name -> System.out.println(name));
    }
}
