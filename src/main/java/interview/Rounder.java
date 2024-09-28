package interview;

public class Rounder {

    /*
     * round() accepts a double d and returns an int.
     * The resulting integer should be rounded up when the decimal is >= .5
     * Negative numbers should also be rounded up, but the result should remain negative.
     * ex: -3.6 => -4
     */
    public static int round(double d) {
        // TODO implement round().

        // Rounding positive numbers
        if (d >= 0){
            if (d % 1 >= 0.5){
                return (int)(d + 1);
            }
            else{
                return (int)(d);
            }
        }

        // Rounding megative numbers
        else{
            if (d % 1 <= -0.5){
                return (int)(d - 1);
            }
            else{
                return (int)(d);
            }
        }

    }
}

    