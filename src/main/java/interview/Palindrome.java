package interview;
public class Palindrome {

    /*
     * A palindrome is a word spelled the same way forward and reverse.
     * isPalindrome() accepts a string and returns a boolean.
     * 
     */
    public static boolean isPalindrome(String word) {
        // TODO implement isPalindrome().

        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        
        return true;
    }
    
}
