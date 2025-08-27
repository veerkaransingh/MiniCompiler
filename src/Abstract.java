
abstract class Base2{ //ek aisi class jiski help lekar aur classes bnegi. ek standard set kr diya
    //eska object ban hi nahi skta
    public Base2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Base2{ // base2 ke help ek concrete class ban gyi yahan pe
    //abstract class ke saare methods should be used
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good afternoon");
    }

}
abstract class Child3 extends Base2{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstract {
    // abstract ka sidha sadha matlab = khayali pulaao, kuch exist krta hi nahi he he he
    public static void main(String[] args) {
        Child2 c = new Child2();
       // Parent2 c = new Parent2(); -- not possible, because abstract class ka object nahi ban skta, we can just create other
        // concrete classes from this one
        // Child3 c2 = new Child3(); -- error


    }

}
