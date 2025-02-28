public class ScoreInfo {
    private int score;
    private int numStudents;

    public ScoreInfo(int score) {
        this.score = score;
        this.numStudents = 1;
    }

    public void increment() {
        this.numStudents++;
    }

    public int getScore() {
        return this.score;
    }

    public int getFrequency() {
        return this.numStudents;
    }
}
