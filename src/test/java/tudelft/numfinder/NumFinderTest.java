package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumFinderTest {

    @Test
    void findsZeroIsSmallestInAscendingPositiveSequence() {
        NumFinder numFinder = new NumFinder();
        numFinder.find(new int[] {0, 1, 2});

        Assertions.assertEquals(0, numFinder.getSmallest());
    }

    @Test
    void findsZeroIsSmallestInDescendingPositiveSequence() {
        NumFinder numFinder = new NumFinder();
        numFinder.find(new int[] {2, 1, 0});

        Assertions.assertEquals(0, numFinder.getSmallest());
    }

    @Test
    void findsMinusThreeIsSmallestInAscendingNegativeSequence() {
        NumFinder numFinder = new NumFinder();
        numFinder.find(new int[] {-3, -2, -1});

        Assertions.assertEquals(-3, numFinder.getSmallest());
    }

    @Test
    void findsMinusThreeIsSmallestInDescendingNegativeSequence() {
        NumFinder numFinder = new NumFinder();
        numFinder.find(new int[] {-1, -2, -3});

        Assertions.assertEquals(-3, numFinder.getSmallest());
    }

    @Test
    void findsZeroIsLargestInAscendingPositiveSequence() {
        NumFinder numFinder = new NumFinder();
        numFinder.find(new int[] {0, 1, 2});

        Assertions.assertEquals(2, numFinder.getLargest());
    }

    @Test
    void findsTwoIsLargestInDescendingPositiveSequence() {
        NumFinder numFinder = new NumFinder();
        numFinder.find(new int[] {2, 1, 0});

        Assertions.assertEquals(2, numFinder.getLargest());
    }

    @Test
    void findsMinusThreeIsLargestInAscendingNegativeSequence() {
        NumFinder numFinder = new NumFinder();
        numFinder.find(new int[] {-3, -2, -1});

        Assertions.assertEquals(-1, numFinder.getLargest());
    }

    @Test
    void findsMinusOneIsLargestInDescendingNegativeSequence() {
        NumFinder numFinder = new NumFinder();
        numFinder.find(new int[] {-1, -2, -3});

        Assertions.assertEquals(-1, numFinder.getLargest());
    }

    @Test
    void findRisesExceptionIfGivenEmptyArray() {
        NumFinder numFinder = new NumFinder();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            numFinder.find(new int[]{});
        });
    }
}