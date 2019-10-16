package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleMatchingWordsR() {
        int words = new CountLetters().count("catr|dogx");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatchR() {
        int words = new CountLetters().count("catr|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void empty() {
        int words = new CountLetters().count("");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void lastWordDoesNotMatchNoWordInTheMiddle() {
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void multipleMatchingWordsRNoWordInTheMiddle() {
        int words = new CountLetters().count("cat|dogx");
        Assertions.assertEquals(1, words);
    }
}