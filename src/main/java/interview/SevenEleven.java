package interview;
public class SevenEleven {
    
    /*
     * The shop() method takes an int x and returns:
     *     - "seven" if x is a multiple of seven.
     *     - "eleven" if x is a multiple of eleven
     *     - "seveneleven" if x is a multiple of seven and eleven
     *     - "" if x is not a multiple of seven or eleven
     */
    public static String shop(int x) {
        // TODO implement shop().
        // start with an empty string
        String result = "";
        // if the number is divisible by 7 with a remainder of 0 it's a multiple of seven
        if (x % 7 == 0){
        // if thats the case add "seven" to the empty string so now it says "seven"
        // if its not, then the string is still empty and it says nothing
            result += "seven";
        }
        // if the nuber is divisible by 11 with no remainder it's a multiple of eleven 
        if (x % 11 == 0){
        // if thats the case add eleven to the string
        // so if the previous one is true and it already says "seven"
        // it just adds "eleven" to "seven" so it can say 'seveneleven'
        // if it's not then it adds "eleven" to the empty string so it says "eleven"
            result += "eleven";
        }

        return result;
        
        
    }
}