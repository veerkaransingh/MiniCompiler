package javapractice;


class base1 {
     base1() {
        System.out.println("I am a constructor"); //constructor of base class would be called first that derived class
    }
    base1(int a){
        System.out.println("I am an overloaded constructor with value of a as: " + a);
    }

}


class base2 extends base1{

        base2(){
            super(0); //if we want to run constructor having argument in base class, super keyword is used, if not, default will be called
            System.out.println("i am a derived class constructor");
        }
}

public class Constructorsininheritance {
    public static void main(String[] args) {
        base2 b = new base2(); // we have initiated the object of derived or base2 class, now constructor of parent has been called first
        // rather than the derived one

        }
    }

