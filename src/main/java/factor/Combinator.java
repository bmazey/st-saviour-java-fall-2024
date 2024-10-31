package factor;

public class Combinator {

    // Use a for loop and ensures that the product is equal to product times the integer i
    public static int factorial(int n) {
        int product = 1;
        for(int i = n; i >= 1; i--){
            product = product * i;
        }
        return product;
    }

    // TODO document
    public static int choose(int n, int k) {
    // Use the choose formula (n/k*(n-k))
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    
}
