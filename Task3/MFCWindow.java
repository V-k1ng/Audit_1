public class MFCWindow {

    private int category;
    private boolean busy;

    public MFCWindow(int category) {
        this.category = category;
        this.busy = false;
    }

    public boolean acceptsCategory(int category) {
        return this.category == category || this.category == 1;
    }

    public boolean isBusy() {
        return busy;
    }

    public void serveCitizen(Citizen citizen) {
        this.busy = true;
        // обслуживание гражданина
        this.busy = false;
    }
}
