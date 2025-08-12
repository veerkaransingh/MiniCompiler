package javapractice;

public class Methods_overloading {
    //static void tellJoke(){  // static keyword is used to associate a method of a given class with the class rather than the object.
        // static method in a class is shared by all objects. we don't need to create an object to call method.
        //System.out.println("I invented a word:\n" + "Plagiarism");
    //}

    static void change(int a){
         a = 423;
    }
    static void change2(int[] arr){
        arr[0] = 99;
    }
    static void foo(){
        System.out.println("Good morning bro");
    }

    static void foo(int a ){
        System.out.println("good morning " + a + "bro");
    }
    static void foo(int a, int b ){
        System.out.println("good morning " + a  + "bro");
        System.out.println("good morning " + b  + "bro");
    }

    public static void main(String[] args) {
        foo();
        foo(200);
        foo(4000, 344);
       // tellJoke();
        //int[] marks = {23, 34, 21, 99, 19, 55};
        //change2(marks);
        //System.out.println("Value of marks[0] after running change2 " + marks[0]);
        //int x = 33; // a copy of x will be passed to the change method rather than the original value which will still stay the same.
        //change(x);
       // System.out.println("The value of x after running method change will be " + x);

//methods overloading - methods having same name ,but performing things.

    }
}
