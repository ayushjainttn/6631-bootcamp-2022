import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread "+Thread.currentThread().getName()+" is executing....");
    }
}

class MyThread2 implements Callable{
    @Override
    public Object call() throws Exception{
        System.out.println("Thread "+Thread.currentThread().getName()+" is executing....");
        return new String("Thread "+Thread.currentThread().getName()+" is executed.");
    }
}

public class Question4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureReturn = new FutureTask<>(new MyThread2());
        Thread th1 = new Thread(new MyThread1());
        th1.setName("Thread1");
        th1.start();
        th1.sleep(2000);
        Thread th2 = new Thread((futureReturn));
        th2.setName("Thread2");
        th2.start();
        System.out.println(futureReturn.get());
    }
}