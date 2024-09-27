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

        // Sets the condition if d modulo 1 is greater than or equal to 0.5, round up
        if (d % 1 >= 0.5) {
            return (int)d + 1;
        }

        // Sets the condition if d modulo 1 is less than or equal to -0.5, round down
        if (d % 1 <= -0.5) {
            return (int)d - 1;
        }
        return (int)d;
    }
}
