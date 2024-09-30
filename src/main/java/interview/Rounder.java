package interview;

public class Rounder {

    /*
     * round() accepts a double d and returns an int.
     * The resulting integer should be rounded up when the decimal is >= .5
     * Negative numbers should also be rounded up, but the result should remain negative.
     * ex: -3.6 => -4
     */
    public static int round(double d){
        // TODO implement round().
        
        // Uses the modulo of one to find out if the number isn't a decimal to round up
        if (d % 1 >= 0.5){
        // Adds one to the number if it is a decimal greater than 0.5
            return (int)d + 1;

        }
         // Uses the modulo of one to find out if the nnegative umber isn't a decimal
        if(d % 1 <= -0.5){
        // Subtracts one to the number if it is a decimal greater than 0.5 to round up
            return (int)d - 1;
    
        }
        return(int)d;
    }
    
    }

