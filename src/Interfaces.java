
interface Bicycle{ //all the methods inside this are abstract, we have to implement them in any condition
    //in java, group of related methods with empty bodies
    int a = 45; // these properties inside an interface can not be modified
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int a = 45;
    void blowHornK3g();
    void blowHornmhn();

}

class AvonCycle implements Bicycle{ // AvonCycle is implementing Bicycle interface
    int speed = 7;
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBrake(int decrement) {
        System.out.println("Applying brakes");

    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }

    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po ");
    }

}
public class Interfaces {
    //INTERFACE IS A POINT WHERE TWO SYSTEMS INTERACT.
    // IN JAVA, INTERFACE IS A GROUP OF RELATED METHODS WITH EMPTY BODIES
    public static void main(String[] args) {

        System.out.println("lets learn interfaces");
        AvonCycle cycleKaran = new AvonCycle();
        cycleKaran.applyBrake(1);
        cycleKaran.blowHornK3g();
        cycleKaran.blowHornmhn();
    }
}
