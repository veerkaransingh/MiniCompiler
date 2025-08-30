package javapractice;

interface MyCamera{
    void takeSnap();
    void recordvideo();
}

interface MyWifi{
    String[] getNetwords();
    void connectToNetwork(String network);
}
class CellPhone{

    void callNumber(int phonenumber){
        System.out.println("Calling " + phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}

class MySmartPhone extends CellPhone implements MyWifi, MyCamera{
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
    public void connectToNetwork


}
public class Defaultmethods {
}
