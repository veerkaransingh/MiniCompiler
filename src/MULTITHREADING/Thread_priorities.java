package MULTITHREADING;


class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i < 200) {
            System.out.println("Thank youuuuuuuu " + this.getName());
            i++;
        }
    }
}

public class Thread_priorities {
    public static void main(String[] args) {
        // ready queue -- T1, T2, T3, T4
        // JVM manages all these threads and is responsible for providing CPU to these threads
        // Thread Scheduler Component is there is JVM

        MyThr1 t1 = new MyThr1("Star");
        MyThr1 t2 = new MyThr1("Bucks");
        MyThr1 t3 = new MyThr1("Tim");
        MyThr1 t4 = new MyThr1("Hortons");
        MyThr1 t5 = new MyThr1("H&M(most important)"); // suppose this is the most important thread
        t5.setPriority(Thread.MAX_PRIORITY); // set priority for threads but usually, OS decides itself
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
