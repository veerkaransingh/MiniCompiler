package MULTITHREADING;

class MyThr extends Thread{
    public MyThr(String name){ // Created a constructor for giving a name to the thread so that we can refer it later
        super(name); // thread class already has a constructor taking name, here we called constructor of thread class which takes name

    }
    public void run(){
        int i = 0;
        while(i < 30){
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class Thread_Constructors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Kerry"); // passed name to thread
        MyThr t2 = new MyThr("Hit");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is "+ t1.getId()); // getId is a method which will return ID of this thread
        System.out.println("The name of the thread is "+ t1.getName()); // getName is a method to return name of the thread

        System.out.println("The id of the thread t2 is "+ t2.getId()); // getId is a method which will return ID of this thread
        System.out.println("The name of the thread is "+ t2.getName()); // getName is a method to return name of the thread
    }
}
