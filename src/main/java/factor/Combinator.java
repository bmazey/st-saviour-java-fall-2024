package factor;

public class Combinator {

    // TODO document
    public static int factorial(int n) {
        // FIXME for +10 bonus!
        
        // loop multiplying int n by all numbers starting from n and going backwards until 1
        int product = 1;
        for (int i = n; i >= 1; i --){
            product = product * i;
        }
        return product;
    }

  
    // TODO document
    public static int choose(int n, int k) {
        // FIXME for +10 bonus!
        
        // loop calculating n!
        int nfactorial = 1;
        for (int i = n; i >= 1; i --){
            nfactorial = nfactorial * i;
        }
        
        // loop calculating k!
        int kfactorial = 1;
        for (int i = k; i >= 1; i --){
            kfactorial = kfactorial * i;
        } 

        // loop calculating (n - k)!
        int nkfactorial = 1;
        for (int i = (n - k); i >= 1; i--) {
            nkfactorial = nkfactorial * i;
        }        

        // combination formula for result
        return nfactorial/(kfactorial * nkfactorial);
    }
    
}
