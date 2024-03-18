import java.util.concurrent.CopyOnWriteArrayList;

public class Writer implements Runnable {

    private CopyOnWriteArrayList<Integer> listOfNumbers;

    public Writer(CopyOnWriteArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            try {
                Thread.sleep(1500); // Небольшая задержка
                listOfNumbers.add(count);
                System.out.println("Writing to list: " + count);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}