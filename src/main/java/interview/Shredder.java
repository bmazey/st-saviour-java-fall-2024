package interview;

public class Shredder {
    
    public static String shredFirstCharacter(String word) {
        // TODO implement, use substring()
        // since the first character is at position 0
        // the character at positon 1 is the next one after the first
        // what this does that it returns the character at postion 1
        // (the second character)
        // and it also returns all the characters after it
        // so the first character is excluded
        return word.substring(1);
       
    }

    public static String shredLastCharacter(String word) {
        // TODO implement, use substring()
        // the length of the word is all the characters in it
        // word.length()-1 is basically saying one less the length of the word
        // this removes the last character
        // since taking out the letter makes the length of the new word one less the length of the original
        return word.substring(0, word.length()-1);
    }
}
