package interview;
public class Palindrome {

    /*
     * A palindrome is a word spelled the same way forward and reverse.
     * isPalindrome() accepts a string and returns a boolean.
     * 
     */
    public static boolean isPalindrome(String word) {
        // TODO implement isPalindrome().
        int start = 0;
        int end = word.length() - 1;

        // Check if the characters at the start and end are the same, and move towards the center
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
}
