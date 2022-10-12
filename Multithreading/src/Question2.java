import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Runnable{
    private String name;
    public Task(String s){
        name = s;
    }

    public void run(){
        for(int i=0;i<=5;i++){
            Date d = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
            if(i==0){
                System.out.println(name+" started at "+ft.format(d));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i == 5){
                System.out.println(name + " completed at "+ft.format(d));
            }
        }
    }
}
class FixedThreadPool{
    public static void execute() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);

        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(r1);
        pool.submit(r2);
        pool.submit(r3);
        pool.submit(r4);
        pool.submit(r5);
        latch.await();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread Execution is completed"+"\n");
        pool.shutdown();
    }
}

class CachedThreadPool{
    public static void execute(){
        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");

        ExecutorService executor = Executors.newCachedThreadPool();
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);
        executor.submit(r4);
        executor.submit(r5);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread Execution is completed"+"\n");
        executor.shutdown();

    }
}

class SingleThreadExecutor{
    public static void execute() {
        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);
        executor.submit(r4);
        executor.submit(r5);
    }
}
public class Question2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Cached Thread Pool Started : ");
        CachedThreadPool.execute();

        System.out.println("Fixed Thread Pool Started : ");
        FixedThreadPool.execute();

        System.out.println("Single Thread Pool Started : ");
        SingleThreadExecutor.execute();
    }
}