/**
 * This is a simple example of a thread in Java.
 */

public class SimpleThreadExample {

    public static void main(String[] args) {
        //createThread();
        createTwoThreads();

    }

    private static void createTwoThreads() {
        Thread myThread1 = new Thread(new MyThread("Thread 1"));
        Thread myThread2 = new Thread(new MyThread("Thread 2"));
        myThread1.start();
        myThread2.start();
    }

    private static void createThread() {
        Thread myThread = new Thread(new MyThread("Thread 2"));
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
