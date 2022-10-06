/*
1) Create and Run a Thread using Runnable Interface and
Thread class and show usage of sleep and join methods in the created threads.
 */

public class Question1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker1(), "Thread1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread t2 = new Worker2();
        t2.setName("Thread2");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread t3 = new Worker2();
        t3.setName("Thread3");
        t3.start();


    }
}

class Worker2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getName()+" running...");
        try {
            Thread.sleep(1000L);
            System.out.println("Thread "+Thread.currentThread().getName()+" waked up after 1 sec.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Worker1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getName()+ " running...");
        System.out.println("Thread "+Thread.currentThread().getName()+" waked up after 1 sec.");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}