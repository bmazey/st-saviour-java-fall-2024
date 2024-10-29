package factor;

public class Combinator {

    // TODO document
    public static int factorial(int n) {
        // FIXME for +10 bonus!
        int product = 1; // Set beginning product to 1
        
        // Create recursive loop to compute n!
        for(int i = n; i >= 1; i--){
            product = product*i;
        }
        return product;
    }

    // TODO document
    public static int choose(int n, int k) {
        int productn = 1;
        
        // Create recursive loop to compute n!
        for(int i = n; i >= 1; i--){
            productn = productn*i;
        }

        int productk = 1;
        
        // Create recursive loop to compute k!
        for(int i = k; i >= 1; i--){
            productk = productk * i;
        }

        // Implement given formula 
        int denominator = productn - productk;
        int result = productn / ( productk * denominator ); 

        return result;
    }
    
}
