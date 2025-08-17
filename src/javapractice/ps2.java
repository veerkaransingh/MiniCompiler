package javapractice;

class Cylinder{

    public Cylinder(int height, int radius){
        this.radius = radius;
        this.height = height;
    }
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }
   public int getHeight(){
        return height;
   }
   public void setHeight(int h){
        height = h;
   }
   public double surfaceArea(){
    return (2 * Math.PI * radius * radius ) + (2*Math.PI * radius*height);
    }
    public double volume(){
        return  Math.PI *radius*radius*height;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.breadth = 5;
        this.length = 4;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }
    public  int getBreadth(){
        return breadth;
    }
}

public class ps2 {
    public static void main(String[] args) {

        Cylinder myCylinder = new Cylinder(9,12);
        Rectangle myRectangle = new Rectangle(5,9);
       // int h = 12;
       // int r = 231;
       // myCylinder.setHeight(h);
       // myCylinder.setRadius(r);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
        System.out.println(myRectangle.getBreadth());
        System.out.println(myRectangle.getLength());
    }
}
