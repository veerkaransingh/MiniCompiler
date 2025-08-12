package javapractice;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String naam){
        name = naam;
    }
}

class cellPhone{
    public void ring(){
        System.out.println("ringing");
    }

    public void vibrate(){
        System.out.println("vibrating...");
    }

    public void callFriend(){
        System.out.println("calling you");
    }
}

class Square{
    int side; // setting attribute of square class
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}

class TommyVecetti{  //created a new custom class
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}


public class practice {
    public static void main(String[] args) {
    /*    javapractice.Employee1 karan = new javapractice.Employee1();

        karan.getSalary();
        karan.setName("Coding With Karan");
        karan.salary = 111222;
        System.out.println(karan.getSalary());
        System.out.println(karan.getName());

        javapractice.cellPhone samsung = new javapractice.cellPhone();
        samsung.callFriend();
        samsung.vibrate();
        samsung.ring(); */


       /* javapractice.Square sq = new javapractice.Square(); // instantiation of an object of square class named as sq
        sq.side = 3;
        System.out.println(sq.area());  //calling the methods
        System.out.println(sq.perimeter()); */

        TommyVecetti t = new TommyVecetti();
        t.fire();
        t.run();
        t.hit();

    }
    }


