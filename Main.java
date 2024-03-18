public class Main {

    public static void main(String[] args) {
        Runable Runable = new Runable();

        Thread thread1 = new Thread(Runable);
        Thread thread2 = new Thread(Runable);
        Thread thread3 = new Thread(Runable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}