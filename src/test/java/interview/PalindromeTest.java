package interview;

import org.junit.jupiter.api.Test;


public class PalindromeTest {
    
    @Test
    public void testIsPalindrome() {
        assert Palindrome.isPalindrome("racecar");
        assert Palindrome.isPalindrome("civic");
        assert Palindrome.isPalindrome("radar");
        // TODO - add more test cases ...
    }

    @Test
    public void testIsNotPalindrome() {
        assert !Palindrome.isPalindrome("robot");
        assert !Palindrome.isPalindrome("kitten");
        assert !Palindrome.isPalindrome("milkshake");
        // TODO - add more test cases ...
    }
}
