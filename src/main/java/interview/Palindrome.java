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
    // starts with first letter
    int left = 0;
    // starts with last letter
    int right = word.length() - 1;

    // check to see if they aren't the same
    while (left < right) {
        // If the characters at the two pointers are not the same, it's not a palindrome
        if (word.charAt(left) != word.charAt(right)) {
            // return false if they arent equal because then it's not a palindrome
            return false;
        }
        // Move the pointers towards the center
        left++;
        right--;
    } 
        // if they aren't different then it is a palindrome and will return true
        return true;
    }
    
}
