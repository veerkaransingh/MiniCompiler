package MULTITHREADING;


class MyThreadRunnable1 implements Runnable{ // Using Runnable interface
    public void run(){
        int i = 0;
        while (i < 50){
            System.out.println("I am a thread not a threat");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i < 50){
            System.out.println(" I am a threat , hu ha ha ");
            i++;
        }
    }
}
public class Multithreading_using_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1(); // created objects of classes who are implementing runnable
        Thread gun1 = new Thread(bullet1); // passed runnable to a new thread
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);  // passed runnable to a new thread
        // bullet1.start(); ---- not possible because start method can't be initiated directly using runnable interface
        // bullet2.start();

        gun1.start(); // ek new thread bnaakar usko runnable ka object pass krdiya

        gun2.start();
    }
}
