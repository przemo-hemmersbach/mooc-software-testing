package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher encoder;
    final private int NEUTRAL_SHIFT = 0;

    @BeforeEach
    public void beforeEach() {
        encoder = new CaesarShiftCipher();
    }

    @Test
    public void spacesAreOK() {
        String message = "a a";
        Assertions.assertEquals(message, encoder.CaesarShiftCipher(message, NEUTRAL_SHIFT));
    }

    @Test
    public void asIntoBs() {
        Assertions.assertEquals("bb", encoder.CaesarShiftCipher("aa", 1));
    }

    @Test
    public void asIntoZs() {
        Assertions.assertEquals("zz", encoder.CaesarShiftCipher("aa", 25));
    }

    @Test
    public void zeroTripIsNeutral() {
        Assertions.assertEquals("aa", encoder.CaesarShiftCipher("aa", 0));
    }

    @Test
    public void twentySixTripIsneutral() {
        Assertions.assertEquals("aa", encoder.CaesarShiftCipher("aa", 26));
    }

    @Test
    public void emptyStringIsStillEmpty() {
        Assertions.assertEquals("", encoder.CaesarShiftCipher("", 3));
    }
}
