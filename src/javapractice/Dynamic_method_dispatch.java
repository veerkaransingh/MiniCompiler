package javapractice;

class Phone{
    public void on(){
        System.out.println("Turning on phone...");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}
class Smartphone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on smartphone...");
    }
    public void music(){
        System.out.println("Playing music");
    }
    public void swagat(){
        System.out.println("Apka swagat hai");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone(); //runtime pe ek object ban jayeg, obj ek refrence bna diya new phone ke liye
        //Smartphone smobj = new Smartphone();
        //obj.name();

        Phone obj = new Smartphone();  // super class ka reference can be equal to sub class ka object
        obj.on(); //object ka run hoga method, na ke reference ka
        //Runtime polymorphism
        // object ka creation runtime pe hoga
        // dynamic method dispatch - method runtime pe decide hota hai ke konsa run hoyega
        //obj.music(); - this is not allowed because obj reference hai ek right, to woh kisi vi new phone ko refer kr skta hai,
        // it can't run mthods of subclass or child class


    }
}
