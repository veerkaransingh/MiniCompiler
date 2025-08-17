package javapractice;

class Base{
    int x;
    public void printme(){
        System.out.println("i am a constructor");
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.println("I am in base and setting X now");
        this.x = x;
    }
}

class Derived extends Base{ //Base class ki saari cheezen available ho jayengi Derived mei!!
    int y;  //y can not be accessed from base

    public int getY(){
        return y;
    }
    public void setY(){
        this.y = y;
    }


}


public class Inheritance {

    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());


        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
    }

}
