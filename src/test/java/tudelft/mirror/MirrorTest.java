package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    Mirror mirror;

    @BeforeEach
    void beforeEach() {
        mirror = new Mirror();
    }

    @Test
    void emptyStringHaveEmptyMirror() {
        String s = "";

        String m = mirror.mirrorEnds(s);

        Assertions.assertEquals(s, m);
    }

    @Test
    void singleCharIsItsOwnMirror() {
        String s = "a";

        String m = mirror.mirrorEnds(s);

        Assertions.assertEquals(s, m);
    }

    @Test
    void uniqueCharsHaveEmptyMirror() {
        String s = "abc";

        String m = mirror.mirrorEnds(s);

        Assertions.assertEquals("", m);
    }

    @Test
    void sameCharsOnTheOutsideAndSingleInTheMiddleAreAllMirror() {
        String s = "cdefedc";

        String m = mirror.mirrorEnds(s);

        Assertions.assertEquals(s, m);
    }

    @Test
    void allSameCharsAreAllMirror() {
        String s = "cdeffedc";

        String m = mirror.mirrorEnds(s);

        Assertions.assertEquals(s, m);
    }

    @Test
    void onlyStartingCharsAreSameWillHaveMirrorEqualToFirstHalf() {
        String s = "abXYba";

        String m = mirror.mirrorEnds(s);

        Assertions.assertEquals("ab", m);
    }

    @Test
    void ingoreSameCharsInTheMiddle() {
        String s = "XabaY";

        String m = mirror.mirrorEnds(s);

        Assertions.assertEquals("", m);
    }
}
