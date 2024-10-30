package factor;

public class Fibonacci {
    
    // sequence() accepts an integer n and returns the value of the
    // nth position of a standard fibonacci sequence, starting at 0.
    // Recall the fibonacci sequence is defined as follows ...
    // 0, 1, 1, 2, 3, 5, 8 ...
    // ex: n = 6 -> 8
    public static int sequence(int n) {
        // TODO implement
        // Will return 1 and 0 in the fibonacci sequence 
        if (n <= 1){
            return n;
        }
        // Returns the next number in the fibonacci sequence following 1
        return sequence(n - 1) + sequence(n - 2);
    }
}
