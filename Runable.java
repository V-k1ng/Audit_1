public class Runable implements Runnable {

    @Override
    public void run() {
        long threadId = Thread.currentThread().getId();
        System.out.println("Thread ID: " + threadId);
    }
}