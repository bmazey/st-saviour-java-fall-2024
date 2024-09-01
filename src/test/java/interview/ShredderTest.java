package interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShredderTest {

    @Test
    public void testShredCharacters() {
        // Should remove the first character.
        assertEquals("t. Saviour", Shredder.shredFirstCharacter("St. Saviour"));
        assertEquals("andas", Shredder.shredFirstCharacter("Pandas"));
        assertEquals("", Shredder.shredFirstCharacter("P"));

        // Should remove last character.
        assertEquals("St. Saviou", Shredder.shredLastCharacter("St. Saviour"));
        assertEquals("Panda", Shredder.shredLastCharacter("Pandas"));
        assertEquals("", Shredder.shredLastCharacter("P"));
    }
    
}
