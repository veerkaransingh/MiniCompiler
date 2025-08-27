
abstract class Base2{ //
    public Base2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Child2 extends Base2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }

}
class Child3 extends Base2{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstract {
    // abstract ka sidha sadha matlab = khayali pulaao, kuch exist krta hi nahi he he he
    public static void main(String[] args) {

    }

}
