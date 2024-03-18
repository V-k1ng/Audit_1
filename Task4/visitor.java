class visitor {
    private String name;

    public visitor(String name) {
        this.name = name;
        enterPolyclinic();
    }

    public void enterPolyclinic() {
        Doc therapist = new Doc(this);
        // Patient enters the polyclinic and starts with Therapist
    }
}