class MRT {
    private visitor currentPatient;

    public MRT(visitor patient) {
        this.currentPatient = patient;
        performMriExamination();
    }

    public void performMriExamination() {
        // MRI examination is performed
    }
}
