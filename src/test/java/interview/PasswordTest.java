package interview;

import org.junit.jupiter.api.Test;


public class PasswordTest {
    
    @Test
    public void testPasswordLength() {
        // Ensure that generated password is of length 10.
        assert Password.generatePassword().length() == 10;
    }

    @Test
    public void testPasswordComplexity() {
        String password = Password.generatePassword();

        // Check password characters.
        assert Character.isLetter(password.charAt(0));
        assert Character.isLetter(password.charAt(1));
        assert Character.isLetter(password.charAt(2));
        assert Character.isLetter(password.charAt(3));
        assert Character.isLetter(password.charAt(4));

        // Check password digits.
        assert Character.isDigit(password.charAt(5));
        assert Character.isDigit(password.charAt(6));
        assert Character.isDigit(password.charAt(7));
        assert Character.isDigit(password.charAt(8));

        // Check password symbols.
        assert !Character.isLetterOrDigit(password.charAt(9));
    }

    @Test
    public void testPasswordUnique() {
        // NOTE we overlook collisions for the purpose of this exercise 
        String firstPassword = Password.generatePassword();
        String secondPassword = Password.generatePassword();

        assert !firstPassword.equals(secondPassword);
    }
}
