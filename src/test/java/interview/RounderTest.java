package interview;

import org.junit.jupiter.api.Test;

public class RounderTest {

    @Test
    public void testRounding() {
        // Should remain zero.
        assert Rounder.round(0.0) == 0;
        assert Rounder.round(0.2) == 0;

        // Should round up.
        assert Rounder.round(0.5) == 1;
        assert Rounder.round(0.7) == 1;
        assert Rounder.round(1.6) == 2;

        // Should round down.
        assert Rounder.round(0.1) == 0;
        assert Rounder.round(1.2) == 1;
        assert Rounder.round(2.3) == 2;

        // Test negatives.
        assert Rounder.round(-1.5) == -2;
        assert Rounder.round(-3.2) == -3;
        assert Rounder.round(-3.5) == -4;

    }
    
}
