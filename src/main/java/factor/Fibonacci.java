package factor;

public class Fibonacci {
    
    // sequence() accepts an integer n and returns the value of the
    // nth position of a standard fibonacci sequence, starting at 0.
    // Recall the fibonacci sequence is defined as follows ...
    // 0, 1, 1, 2, 3, 5, 8 ...
    // ex: n = 6 -> 8
    public static int fibonacci (int n) {
        if (n == 1){
            return  1;
        }
        if (n == 0) {
            return 0;
        }
        return fibonacci (n-1) + fibonacci (n-2);
    }
        
        // TODO implement
        return 0;
    }
}
