package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    GHappy tester;

    @BeforeEach
    public void setup() {
        this.tester = new GHappy();
    }

    @Test
    public void noGeesAreStillHappyGees() {
        Assertions.assertTrue(tester.gHappy("aaaaa"));
    }

    @Test
    public void firstCharIsGeFollowedByGeIsHappy() {
        Assertions.assertTrue(tester.gHappy("ggaa"));
    }

    @Test
    public void firstCharIsGeFollowedByNonGeeIsNotHappy() {
        Assertions.assertFalse(tester.gHappy("gaga"));
    }

    @Test
    public void geFollowedByGeeIsHappyGe() {
        Assertions.assertTrue(tester.gHappy("agga"));
    }

    @Test
    public void geFollowedByNonGeeIsNotHappyGee() {
        Assertions.assertFalse(tester.gHappy("agaga"));
    }

    @Test
    public void geAtTheEndPrecededByGeIsHappyGe() {
        Assertions.assertTrue(tester.gHappy("aagg"));
    }

    @Test
    public void geAtTheEndNotPreceededByGeeIsNotHappyGe() {
        Assertions.assertFalse(tester.gHappy("aaag"));
    }
}
