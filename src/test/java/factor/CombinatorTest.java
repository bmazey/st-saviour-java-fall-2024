package factor;

import org.junit.jupiter.api.Test;

public class CombinatorTest {

    @Test
    public void testFactorial() {
        // TODO implement for +10 bonus!
        assert Combinator.factorial(5) == 120;
        assert Combinator.factorial(7) == 5040;
    }

    @Test
    public void testChoose() {
        // TODO iomplement for +10 bonus!
        assert Combinator.choose(5,2) == 10;
        assert Combinator.choose(7,3) == 35;
    }
    
}
