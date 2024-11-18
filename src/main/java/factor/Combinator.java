package factor;

public class Combinator {

    // TODO document
    public static int factorial(int n) {
        int product = 1;
        // start at the number, and work your way back because the interval is -1
        for (int i = n; i >= i; i--){
            // Multiply the number by the number that holds the position before it
            product = product * i;
        }
        // FIXME for +10 bonus!
        return product;
    }

    // TODO document
    public static int choose(int n, int k) {
        // this is the n! / k! * (n-k)! formula
        // factorial was alraedy defined in the last problem
        // so it just does whatever factorial does whenever theres a factorial to be done
        return factorial(n) / (factorial(k) * factorial(n - k));

        // FIXME for +10 bonus!
        
    }
    
}
