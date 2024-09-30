package interview;
public class Palindrome {

    /*
     * A palindrome is a word spelled the same way forward and reverse.
     * isPalindrome() accepts a string and returns a boolean.
     * 
     */
    public static boolean isPalindrome(String word) {
        // TODO implement isPalindrome().

        // Makes the left the starting point in the string
        int left = 0;

        // Makes the right the ending point in the string
        int right = word.length()-1;

        while (left < right){
        // Tells if the character at the end is different than the one at the start
        if(word.charAt(right) != word.charAt(left)){
            return false;

        }
        left++;
        right--;
        }
        return true;
    }
    
}
