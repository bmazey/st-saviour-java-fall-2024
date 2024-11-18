package factor;

public class Fibonacci {
    
    // sequence() accepts an integer n and returns the value of the
    // nth position of a standard fibonacci sequence, starting at 0.
    // Recall the fibonacci sequence is defined as follows ...
    // 0, 1, 1, 2, 3, 5, 8 ...
    // ex: n = 6 -> 8
    public static int sequence(int n) {
        if (n == 0) return 0;  
        if (n == 1) return 1;  
    
        int prev1 = 0;  
        int prev2 = 1;  
        int current = 0;
    
        // start at 2, go until less then or equal to n, increment is 1
        for (int i = 2; i <= n; i++) {
            // current number is the sum of the last two previous numbers
            current = prev1 + prev2;  
            // the previous number shits back
            prev1 = prev2;  
            // current number shifts back to become a previous number
            prev2 = current;  
        }
    
        return current;
    }
        
}

