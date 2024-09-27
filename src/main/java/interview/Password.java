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
        String password = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String characters = "!@#$%^&*";
        String numbers = "1234567890";

        Random random = new Random();

        password += alphabet.charAt(random.nextInt(alphabet.length()));    
        password += alphabet.charAt(random.nextInt(alphabet.length()));    
        password += alphabet.charAt(random.nextInt(alphabet.length()));    
        password += alphabet.charAt(random.nextInt(alphabet.length()));    
        password += alphabet.charAt(random.nextInt(alphabet.length()));    

        password += numbers.charAt(random.nextInt(numbers.length()));  
        password += numbers.charAt(random.nextInt(numbers.length()));  
        password += numbers.charAt(random.nextInt(numbers.length()));
        password += numbers.charAt(random.nextInt(numbers.length()));   
        
        password += characters.charAt(random.nextInt(characters.length()));
        return password;
    }
}
