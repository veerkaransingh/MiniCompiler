package javapractice;


class First{
    int a;
    First(){  //constructor with no parameter passed
        System.out.println("I am the constructor");
    }
    public int getA(){  //getter method
        return a;
    }
    First(int a){  //constructor with one parameter
        this.a = a;
    }
    public int ret1(){  //method for returning a
        return 4;
    }
}

class Second extends First{  //derived class
    int b;
    Second(){  //constructor of derived class
        System.out.println("I am the constructor of derived class");
    }

    @Override
    public int ret1(){
        return 5;
    }
}
public class this_super {
    public static void main(String[] args) {
        First f = new Second();
        System.out.println(f.ret1());

    }

}
