/**
 * This is a simple example of a thread in Java.
 */

public class SimpleThreadExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread());
        myThread.start();

    }
}

class MyThread implements Runnable {

    String threadName;

    MyThread(String name) {
        this.threadName = name;
    }

    MyThread(){
        this("Default Thread");
    }

    @Override
    public void run() {
        System.out.println("run: " + threadName);
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i + " - " + threadName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println("Thread finished: " + threadName);
    }
}
