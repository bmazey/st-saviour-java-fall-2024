package factor;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testSequence() {
        assert Fibonacci.sequence(0) == 0;
        assert Fibonacci.sequence(1) == 1;
        assert Fibonacci.sequence(2) == 1;
        assert Fibonacci.sequence(3) == 2;
        assert Fibonacci.sequence(6) == 8;
    }
}
