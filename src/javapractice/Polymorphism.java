package javapractice;


interface MyCamera2{
    void takeSnap();
    void recordVideo();
    default void record4kClip(){
        System.out.println("Recording the clip");
    }
    private void greet(){
        System.out.println("greeting");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone2{

    void callNumber(int phonenumber){
        System.out.println("Calling " + phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}

class MySmartPhone2 extends CellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashhant", "Karan"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}


public class Polymorphism {
    public static void main(String[] args){
        MyCamera2 cam1 = new MySmartPhone2(); //this is a smartphone,but use it as a camera
       // cam1.getNetworks(); -- not allowed as we are asking for camera functions, not for wifi functions
        cam1.recordVideo();
        cam1.record4kClip();

    }
}

