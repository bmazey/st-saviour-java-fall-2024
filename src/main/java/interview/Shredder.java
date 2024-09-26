package interview;

public class Shredder {
    
    public static String shredFirstCharacter(String word) {
        // TODO implement, use substring()
        word.substring(1, word.length());
        return word.substring(1, word.length());
    }

    public static String shredLastCharacter(String word) {
        // TODO implement, use substring()
        word.substring(0, word.length()-1);
        return word.substring(0, word.length()-1);
    }
}
