package interview;
public class Palindrome {

    /*
     * A palindrome is a word spelled the same way forward and reverse.
     * isPalindrome() accepts a string and returns a boolean.
     * 
     */
    public static boolean isPalindrome(String word) {
        // TODO implement isPalindrome().

        // Sets left as position 0, or the starting position of the string
        int left = 0;
        // Sets right as the final position of the string
        int right = word.length() - 1;
        
        // While the starting position is less than the ending position
        while (left < right) {
            // Finds the character at the starting and ending position of the string
            // If the character at the beginning and end are not equal return boolean false
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            // Moves the value before or after the positon
            left++;
            right--;
        }
        return true;   
    }
}