package javapractice;

interface MyCamera{
    void takeSnap();
    void recordVideo();
}

interface MyWifi{
    String[] getNetworks();
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
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class Defaultmethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
