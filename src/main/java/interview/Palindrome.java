package interview;
public class Palindrome {

    /*
     * A palindrome is a word spelled the same way forward and reverse.
     * isPalindrome() accepts a string and returns a boolean.
     * 
     */
    public static boolean isPalindrome(String word) {
        // TODO implement isPalindrome().
       // convert string to lowercase just in case its case sensitive
    word = word.toLowerCase();
    
    // create two points: one at the start and one at the end of the string
    
    int left = 0;
    int right = word.length() - 1;

    // Check if the string is a palindrome
    while (left < right) {
        // If the characters at the two pointers are not the same, it's not a palindrome
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        // Move the pointers towards the center
        left++;
        right--;
    } 
        return true;
    }
    
}
