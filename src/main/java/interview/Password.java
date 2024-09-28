package interview;

import java.util.Random;

public class Password {
    
    /*
     * generatePassword() accepts no arguments and returns a string of length ten with the following characteristics:
     *  - The first five characters are letters.
     *  - The next four characters are digits.
     *  - The final character is a symbol.
     */
    public static String generatePassword() {
        // You will have to use a random integer generator for this solution.
        // Random rand = new Random();
        // https://docs.oracle.com/en%2Fjava%2Fjavase%2F22%2Fdocs%2Fapi%2F%2F/java.base/java/util/random/RandomGenerator.html#nextInt(int)

        // TODO implement generatePassword().
      
        // Strings for all letters, digits, and symbols
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "1234567890";
        String symbols = "!@#$%^&*()";

        Random random = new Random();

        // Random five letters, 4 digits, and symbol
        String firstPart = ""
            + alphabet.charAt(random.nextInt(alphabet.length()))
            + alphabet.charAt(random.nextInt(alphabet.length()))
            + alphabet.charAt(random.nextInt(alphabet.length()))
            + alphabet.charAt(random.nextInt(alphabet.length()))
            + alphabet.charAt(random.nextInt(alphabet.length()));

        String secondPart = ""
            + digits.charAt(random.nextInt(digits.length()))
            + digits.charAt(random.nextInt(digits.length()))
            + digits.charAt(random.nextInt(digits.length()))
            + digits.charAt(random.nextInt(digits.length()));

        String finalCharacter = ""
            + symbols.charAt(random.nextInt(symbols.length()));
        
        // Generates password with random strings
        String password = firstPart + secondPart + finalCharacter;

        return password;
    }
}
