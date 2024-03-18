import java.util.Random;

public class Citizen implements Runnable {

    private int category; // 1 - молодые, 2 - пожилые, 3 - бизнесмены
    private MFCWindow[] windows;
    private boolean angry;

    public Citizen(int category, MFCWindow[] windows) {
        this.category = category;
        this.windows = windows;
        this.angry = false;
    }

    @Override
    public void run() {
        Random random = new Random();
        int windowIndex = random.nextInt(windows.length);

        if (windows[windowIndex].acceptsCategory(category) && !windows[windowIndex].isBusy()) {
            windows[windowIndex].serveCitizen(this);
        } else {
            this.angry = true;
        }
    }

    public int getCategory() {
        return category;
    }

    public boolean isAngry() {
        return angry;
    }
}
