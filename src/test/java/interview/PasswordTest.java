package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasswordTest {
    
    @Test
    public void testPasswordLength() {
        // Ensure that generated password is of length 10.
        assertEquals(10, Password.generatePassword().length());
    }

    @Test
    public void testPasswordComplexity() {
        String password = Password.generatePassword();

        // Check password characters.
        assertEquals(true, Character.isLetter(password.charAt(0)));
        assertEquals(true, Character.isLetter(password.charAt(1)));
        assertEquals(true, Character.isLetter(password.charAt(2)));
        assertEquals(true, Character.isLetter(password.charAt(3)));
        assertEquals(true, Character.isLetter(password.charAt(4)));

        // Check password digits.
        assertEquals(true, Character.isDigit(password.charAt(5)));
        assertEquals(true, Character.isDigit(password.charAt(6)));
        assertEquals(true, Character.isDigit(password.charAt(7)));
        assertEquals(true, Character.isDigit(password.charAt(8)));

        // Check password symbols.
        assertEquals(false, Character.isLetterOrDigit(password.charAt(9)));
    }

    @Test
    public void testPasswordUnique() {
        // NOTE we overlook collisions for the purpose of this exercise 
        String firstPassword = Password.generatePassword();
        String secondPassword = Password.generatePassword();

        assert !firstPassword.equals(secondPassword);
    }
}
