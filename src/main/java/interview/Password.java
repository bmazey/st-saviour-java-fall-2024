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
        // all letters, upper and lowercase
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        // numbers/digits
        String digits = "0123456789";
        // symbols
        String symbols = "!@#$%^&*()_+";
        
        Random random = new Random();
        // length is 10
        StringBuilder password = new StringBuilder(10);

        // first 5 letters
    
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(letters.length());
            password.append(letters.charAt(index));
        }

        // following 4 digits
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(digits.length());
            password.append(digits.charAt(index));
        }

        // last is the symbol
        int symbolIndex = random.nextInt(symbols.length());
        password.append(symbols.charAt(symbolIndex));

        return password.toString();
    }

    public static void main(String[] args) {
        System.out.println("Generated Password: " + generatePassword());
    }

}
