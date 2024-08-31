package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SevenElevenTest {

    @Test
    public void shopSevenEleven() {

        // Should get a blank string when not a multiple of 7 or 11.
        assertEquals("", SevenEleven.shop(3));
        assertEquals("", SevenEleven.shop(5));

        // Should get the string "seven" when a multiple of 7.
        assertEquals("seven", SevenEleven.shop(7));
        assertEquals("seven", SevenEleven.shop(14));

        // Should get the string "eleven" when a multiple of 11.
        assertEquals("eleven", SevenEleven.shop(11));
        assertEquals("eleven", SevenEleven.shop(22));

        // Should get the string "seveneleven" when a multiple of 7 and 11.
        assertEquals("seveneleven", SevenEleven.shop(77));
        assertEquals("seveneleven", SevenEleven.shop(154));
    }
    
}
