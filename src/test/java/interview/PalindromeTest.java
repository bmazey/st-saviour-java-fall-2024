package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PalindromeTest {
    
    @Test
    public void testIsPalindrome() {
        assertEquals(true, Palindrome.isPalindrome("racecar"));
        assertEquals(true, Palindrome.isPalindrome("civic"));
        assertEquals(true, Palindrome.isPalindrome("radar"));
        // TODO - add more test cases ...
    }

    @Test
    public void testIsNotPalindrome() {
        assertEquals(false, Palindrome.isPalindrome("robot"));
        assertEquals(false, Palindrome.isPalindrome("kitten"));
        assertEquals(false, Palindrome.isPalindrome("milkshake"));
        // TODO - add more test cases ...
    }
}
