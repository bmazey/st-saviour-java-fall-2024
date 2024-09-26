package interview;

public class Shredder {
    
    public static String shredFirstCharacter(String word) {
        // TODO implement, use substring()

        String first = word.substring(1, word.length());
        return first;
    }

    public static String shredLastCharacter(String word) {
        // TODO implement, use substring()

        String last = word.substring(0, word.length() - 1);
        return last;
    }
}
