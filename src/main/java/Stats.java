import java.util.ArrayList;

public class Stats {

    // Precondition: stored in increasing order by score, no two have same score
    private ArrayList<ScoreInfo> scoreList;

    /*
     * Records a score in the database, preserving the increasing order by score. 
     * 
     * If no other ScoreInfo objects contain score, a new ScoreInfo object is added
     * in the correct position, otherwise the frequency in the existing ScoreInfo
     * object is incremented.
     * 
     * Return true if a new ScoreInfo object was added and false otherwise.
     */
    public boolean record(int score) {
        return true;
    }

    // Records all scores in stuScores in the database, preserving the order.
    public void recordScores(int[] stuScores) {

    }


    
}
