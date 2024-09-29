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
        // first rounding for positive numbers
        // if the number is greater then 0 it is positive
        if (d >= 0) {
            return (int) Math.floor(d + 0.5); 
        } 
        // if not then it must be negative
        else {
            return (int) Math.ceil(d - 0.5); 
        }
    }
}