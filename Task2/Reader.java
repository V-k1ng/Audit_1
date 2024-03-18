import java.util.concurrent.CopyOnWriteArrayList;

public class Reader implements Runnable {

    private CopyOnWriteArrayList<Integer> listOfNumbers;

    public Reader(CopyOnWriteArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); // Небольшая задержка
                System.out.println("Reading from list: " + listOfNumbers.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}