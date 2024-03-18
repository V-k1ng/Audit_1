public class Main {

    public static void main(String[] args) {
        MFCWindow[] windows = new MFCWindow[3];
        windows[0] = new MFCWindow(1);
        windows[1] = new MFCWindow(2);
        windows[2] = new MFCWindow(3);

        Citizen[] citizens = new Citizen[100];
        int[] totalCustomers = new int[3];
        int[] angryCustomers = new int[3];

        // Создание потоков для граждан
        for (int i = 0; i < citizens.length; i++) {
            int category = (i % 3) + 1;
            citizens[i] = new Citizen(category, windows);
            Thread thread = new Thread(citizens[i]);
            thread.start();
            totalCustomers[category - 1]++;
        }

        // Подождать завершения всех потоков и подсчитать ушедших граждан
        try {
            Thread.sleep(10000); // подождать время для обслуживания всех граждан
            for (int i = 0; i < citizens.length; i++) {
                if (citizens[i].isAngry()) {
                    angryCustomers[citizens[i].getCategory() - 1]++;
                }
            }

            // Вывод процента ушедших клиентов каждой категории
            for (int i = 0; i < angryCustomers.length; i++) {
                double percent = (double) angryCustomers[i] / totalCustomers[i] * 100;
                System.out.println("Percentage of angry customers in category " + (i + 1) + ": " + percent + "%");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
