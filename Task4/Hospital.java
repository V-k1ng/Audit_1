import java.util.LinkedList;
import java.util.Queue;

class Hospital {
    private static final int NUM_PATIENTS = 10;

    public static void main(String[] args) {
        Queue<visitor> queue = new LinkedList<>();
        int maxQueueLength = 0;

        for (int i = 0; i < NUM_PATIENTS; i++) {
            visitor newPatient = new visitor("Patient " + (i + 1));
            queue.add(newPatient);

            if (queue.size() > maxQueueLength) {
                maxQueueLength = queue.size();
            }
        }

        System.out.println(" Очередь длинной : " + maxQueueLength);
    }
}