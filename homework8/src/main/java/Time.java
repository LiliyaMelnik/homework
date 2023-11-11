public enum Time {
    BREAKFAST("Time for breakfast"),
    LUNCH ("Time for lunch"),
    DINNER("Time for dinner");
    final String s;
    Time(String s) {
        this.s = s;
    }
    public String getS() {
        return s;
    }
}
