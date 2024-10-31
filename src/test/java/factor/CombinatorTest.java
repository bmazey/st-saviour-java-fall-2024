package factor;

import org.junit.jupiter.api.Test;

public class CombinatorTest {

    @Test
    public void testFactorial() {
        assert Combinator.factorial(5) == 120;
        assert Combinator.factorial(9) == 362880;
    }

    @Test
    public void testChoose() {
        assert Combinator.choose(5, 3) == 10;
        assert Combinator.choose(4, 2) == 6;
    }
    
}
