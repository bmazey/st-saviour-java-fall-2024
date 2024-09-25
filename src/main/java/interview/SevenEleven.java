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

        // 
        if((x % 7 == 0) && (x % 11 == 0)){
            return "seveneleven";
        }
        else if(x % 11 == 0) {
            return "eleven";
        } else if (x % 7 == 0) {
            return "seven";
        } else
            return "";
        }
    }
