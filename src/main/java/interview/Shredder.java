package interview;

public class Shredder {
    
    public static String shredFirstCharacter(String word) {
        // TODO implement, use substring()

        // Creates the string first 
        // Sets the starting position as 1 and the end as the length from 1
        String first = word.substring(1, word.length());
        // Returns the substring 
        return first;
    }

    public static String shredLastCharacter(String word) {
        // TODO implement, use substring()

        // Creates the string last
        // Sets the starting position as 0 and the ending as the final position of the substring
        String last = word.substring(0, word.length() - 1);
        // Returns the substring
        return last;
    }
}
