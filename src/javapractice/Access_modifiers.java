package javapractice;


class C1{ // all modifiers can be used in same class
    public int x = 5; // can be used in same class,
    protected int y = 45;
    int z = 6;
    private int a = 76;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class Access_modifiers{
    //Access modifiers determine whether other classes can use a particular field or invoke a particular method
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); Can't be accessed from the same package because it is private

    }

}
