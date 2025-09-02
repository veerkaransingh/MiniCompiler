package javapractice;

abstract class Pen{
    abstract void write();
    abstract void refill();

}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing with Fountain ink pen");
    }
    void refill(){
        System.out.println("Refilling the same pen");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }

}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();

}
class Human extends Monkey implements BasicAnimal{
    void speak()
    {
        System.out.println("Hello sir... Hello sir...");
    }

    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }

}
public class questions {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        Human karan = new Human();
        karan.sleep();

        //question

        Monkey m1 = new Human(); //human ko monkey ki trah istemaal kro
       // m1.speak(); 00 Cannot use speak method because the reference is monkey which does not have speak method
        m1.jump();
        m1.bite();

        BasicAnimal Karan = new Human(); //Human ko basic animal ki trah istemaal kro




    }

}
