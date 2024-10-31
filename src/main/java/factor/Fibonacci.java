package factor;

public class Fibonacci {
    
    // sequence() accepts an integer n and returns the value of the
    // nth position of a standard fibonacci sequence, starting at 0.
    // Recall the fibonacci sequence is defined as follows ...
    // 0, 1, 1, 2, 3, 5, 8 ...
    // ex: n = 6 -> 8
    public static int sequence(int n) {
        // TODO implement

        // declares first and second position as 0 and 1
        if(n <= 1){
            return n;
        }
        
        int[] result = new int[n + 1];
        result [0] = 0;
        result [1] = 1;

        // adds the two numbers before position i of result array for the value of the nth position
        for (int i = 2; i <= n; i++){           
            result[i] = result[i-1] + result[i -2]; 
        }
        
        return result[n];
        
    }
}
