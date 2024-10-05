package interview;

public class Shredder {
    
    public static String shredFirstCharacter(String word) {
        // TODO implement, use substring()
        String sfc = word.substring(1);
        return sfc;
    }

    public static String shredLastCharacter(String word) {
        // TODO implement, use substring()

       String slc = word.substring(0,word.length() - 1);
        
       return slc;
    }
}
