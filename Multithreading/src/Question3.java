class DoWork{
    synchronized void doWorkUsingSynchronizedMethod(int n) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" is executing Synchronized Method...");
        for (int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
            Thread.sleep(1000);
        }
        System.out.println(Thread.currentThread().getName()+" has executed successfully");
    }

    void doWorkUsingSynchronizedBlock(int n) throws InterruptedException {
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+" is executing Synchronized Block...");
            for (int i=1; i<=10; i++){
                System.out.println(n+" x "+i+" = "+n*i);
                Thread.sleep(1000);
            }
            System.out.println(Thread.currentThread().getName()+" has executed successfully");
        }
    }
}

class Thread1 extends Thread{
    DoWork d1;
    Thread1(DoWork d){
        this.d1 = d;
    }

    @Override
    public void run() {
        try {
            d1.doWorkUsingSynchronizedBlock(9);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            d1.doWorkUsingSynchronizedMethod(8);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread2 extends Thread{
    DoWork d2;
    Thread2(DoWork d){
        this.d2=d;
    }
    @Override
    public void run(){
        try {
            d2.doWorkUsingSynchronizedBlock(7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            d2.doWorkUsingSynchronizedMethod(6);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        DoWork d = new DoWork();
        Thread1 t1 = new Thread1(d);
        t1.setName("Thread1");
        Thread2 t2 = new Thread2(d);
        t2.setName("Thread2");

        t1.start();
        t2.start();
    }
}

