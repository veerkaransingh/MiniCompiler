
interface Bicycle{ //all the methods inside this are abstract, we have to implement them in any condition
    //in java, group of related methods with empty bodies
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    int speed = 7;
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }
    public void speedUp(int increment){
        speed = speed+increment;
    }

}
public class Interfaces {
    //INTERFACE IS A POINT WHERE TWO SYSTEMS INTERACT.
    // IN JAVA, INTERFACE IS A GROUP OF RELATED METHODS WITH EMPTY BODIES
    public static void main(String[] args) {
        System.out.println("lets learn interfaces");
    }
}
