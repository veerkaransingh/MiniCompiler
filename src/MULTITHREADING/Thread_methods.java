package MULTITHREADING;


class MyNewThr1 extends Thread{
    public MyNewThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i < 40){
            System.out.println("Thankss");
            try{
                Thread.sleep(455); // this thread will sleep for 455 milliseconds
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    public MyNewThr2(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while(i<50){
            System.out.println("Threadiiiiinnnnnnngggggg");
            i++;
        }
    }
}

public class Thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1("Karan");
        MyNewThr2 t2 = new MyNewThr2("Bag");
        t1.start(); // t1 ke start hone ke saath hi t2 bhi start ho jata hai
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
       // t1.join(); //. join method can throw an exception
        t2.start();

    }


}
