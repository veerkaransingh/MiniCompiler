
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 40) { //infinite loop, condition stays true
            System.out.println("My thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 40){
            System.out.println("Thread 2 is good");
            System.out.println("I am sad");
            i++;

        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        System.out.println("How switching is performed between threads ");

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start(); //start method apne accordingly run krlega run method ko
        t2.start();
    }
}
