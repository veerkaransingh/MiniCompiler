package javapractice;


class First{
    int a;
    First(){
        System.out.println("I am the constructor");
    }
    public int getA(){
        return a;
    }
    First(int a){
        this.a = a;
    }
    public int reta(){
        return 4;
    }
}

class Second extends First{
    Second(){
        System.out.println("I am the constructor of derived class");
    }
}
public class this_super {
    //
    //
}
