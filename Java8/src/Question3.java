/*
Q3)Create a thread using lambda function
 */

public class Question3 {
    public static void main(String[] args) {
        Runnable myThread = ()->{
            Thread.currentThread().setName("myThread");
            System.out.println(
                    Thread.currentThread().getName()
                            + " is running");
        };
        Thread thread = new Thread(myThread);
        thread.start();
    }
}
