package factor;

import org.junit.jupiter.api.Test;

public class CombinatorTest {

    @Test
    public void testFactorial() {
        // Test for factorial of 0 (0! = 1)
        assert Combinator.factorial(0) == 1;
        
        // Test for factorial of 1 (1! = 1)
        assert Combinator.factorial(1) == 1;
        
        // Test for factorial of 5 (5! = 120)
        assert Combinator.factorial(5) == 120;
    }

    @Test
    public void testChoose() {
        // Test C(5, 2) = 10
        assert Combinator.choose(5, 2) == 10;

        // Test C(6, 3) = 20
        assert Combinator.choose(6, 3) == 20;

        // Test C(10, 5) = 252
        assert Combinator.choose(10, 5) == 252;
    }
    
}
