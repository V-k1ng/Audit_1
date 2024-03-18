class Doc {
    private visitor currentPatient;

    public Doc(visitor patient) {
        this.currentPatient = patient;
        performExamination();
    }

    public void performExamination() {
        MRT mriRoom = new MRT(currentPatient);
        // Therapist examines the patient and sends them to MRI Room
    }
}

