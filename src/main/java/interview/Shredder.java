package interview;

public class Shredder {
    
    public static String shredFirstCharacter(String word) {
        // TODO implement, use substring()
        // Uses a substring that starts at the second letter so the first letter is removed
        word.substring(1, word.length());
        return word.substring(1, word.length());
    }

    public static String shredLastCharacter(String word) {
        // TODO implement, use substring()
        // Uses the substring to get the first part of the word 
        //and then uses length -1 to get rid of the last letter
        word.substring(0, word.length()-1);
        return word.substring(0, word.length()-1);
    }
}
