package MULTITHREADING;

class Practice13 extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Good morning");
            i++;
        }
    }
}
class Practice13B extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {
            try {
                Thread.sleep(200); // agar yeh code na ho kisi reason se
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
            i++;
        }
    }
}
public class Thread_practice {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();

        Practice13B p2 = new Practice13B();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState()); // to get state of current thread
      // parallelism achieved

    }
}
