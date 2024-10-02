package interview;

public class Shredder {
    
    public static String shredFirstCharacter(String word) {
        // TODO implement, use substring()

        return word.substring(1);
    }

    public static String shredLastCharacter(String word) {
        // TODO implement, use substring()

        return word.substring(0, word.length() - 1);
    }
}
