public class Methodsinjava {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;

        }
        return z; // return value z to the location from where it has been called!!

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b); // called the function

        int a1 = 1;
        int b1 = 2;
        int c2;
        c2 = logic(a1, b1);

        System.out.println(c);
        System.out.println(c2);
    }
}
