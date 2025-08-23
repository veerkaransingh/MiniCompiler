package javapractice;


class base1 {
    base1() {
        System.out.println("I am a constructor"); //constructor of base class would be called first that derived class
    }
    base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }

}


class base2 extends base1{

    base2(){
            super(0); //if we want to run constructor having argument in base class, super keyword is used, if not, default will be called
            System.out.println("I am a derived class constructor");
    }
    base2(int x, int y){
            super(0);
            System.out.println("I am an overlaoded constructor of derived or base2 with value of y as: "+y);
    }
}

class ChildofBase2 extends base2{
    ChildofBase2(){
        System.out.println("I am a ChildofBase2 class constructor");
    }
    ChildofBase2(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of ChildofBase2 class with value of z as: "+z);
    }

}
public class Constructorsininheritance {
    public static void main(String[] args) {
        //base2 b = new base2(); // we have initiated the object of derived or base2 class, now constructor of parent has been called first
        //rather than the derived one
        ChildofBase2 bb = new ChildofBase2(2,3,4);

        }
    }

