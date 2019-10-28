package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {
    TwoNumbersSum calcualtor;

    @BeforeEach
    void beforeEach() {
        calcualtor = new TwoNumbersSum();
    }

    @Test
    void emptyInputEmptyOutput() {
        Assertions.assertEquals(
                new ArrayList<Integer>(),
                calcualtor.addTwoNumbers(new ArrayList<Integer>(), new ArrayList<Integer>())
        );
    }

    @Test
    void zeroPlusZeroIsZero() {
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(0)),
                calcualtor.addTwoNumbers(
                        new ArrayList<Integer>(Arrays.asList(0)),
                        new ArrayList<Integer>(Arrays.asList(0))
                )
        );
    }

    @Test
    void ninePlusNineIsEighteen() {
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(1, 8)),
                calcualtor.addTwoNumbers(
                        new ArrayList<Integer>(Arrays.asList(9)),
                        new ArrayList<Integer>(Arrays.asList(9))
                )
        );
    }

    @Test
    void ninetyNinePlustNineIsOneHundredAndEight() {
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(1, 0, 8)),
                calcualtor.addTwoNumbers(
                        new ArrayList<Integer>(Arrays.asList(9,9)),
                        new ArrayList<Integer>(Arrays.asList(9))
                )
        );
    }

    @Test
    void ninePlustNintyNineIsOneHundredAndEight() {
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(1, 0, 8)),
                calcualtor.addTwoNumbers(
                        new ArrayList<Integer>(Arrays.asList(9)),
                        new ArrayList<Integer>(Arrays.asList(9, 9))
                )
        );
    }

    @Test
    void nintyNinePlustOneIsOneHundred() {
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(1, 0, 0)),
                calcualtor.addTwoNumbers(
                        new ArrayList<Integer>(Arrays.asList(9, 9)),
                        new ArrayList<Integer>(Arrays.asList(1))
                )
        );
    }

    @Test
    void twoPlusTwoIsFour() {
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(4)),
                calcualtor.addTwoNumbers(
                        new ArrayList<Integer>(Arrays.asList(2)),
                        new ArrayList<Integer>(Arrays.asList(2))
                )
        );
    }

    @Test
    void twoPlusNothingIsTwo() {
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(2)),
                calcualtor.addTwoNumbers(
                        new ArrayList<Integer>(Arrays.asList(2)),
                        new ArrayList<Integer>() {}
                )
        );
    }

    @Test
    void nothingPlusTwoIsTwo() {
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(2)),
                calcualtor.addTwoNumbers(
                        new ArrayList<Integer>() {},
                        new ArrayList<Integer>(Arrays.asList(2))
                )
        );
    }
}
