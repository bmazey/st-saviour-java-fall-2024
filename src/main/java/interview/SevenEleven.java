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

        // Uses modulo to find if a number is a multiple of seven and eleven
        if((x % 7 == 0) && (x % 11 == 0)){
            return "seveneleven";
        }
        // Uses modulo to find out if it is only a multiple of eleven
        else if(x % 11 == 0) {
            return "eleven";
        // Uses mmodulo to find out if its only a multiple of seven
        } else if (x % 7 == 0) {
            return "seven";
        // returns nothing if it is neither a multiple of seven nor eleven 
        } else
            return "";
        }
    }
