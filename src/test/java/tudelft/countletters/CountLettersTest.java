package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @ParameterizedTest(name = "input={0}, expectedResult={1}")
    @CsvSource({
            "cats|dogs,2",
            "foxes|dogs,2",
            "cats|foxes,2"
    })
    public void multipleMatchingWords(String inputString, int expectedResult) {
        int words = new CountLetters().count(inputString);
        Assertions.assertEquals(expectedResult, words);
    }

    @ParameterizedTest(name = "input={0}, expectedResult={1}")
    @CsvSource({
            "cats|dog,1",
            "cats|fox,1"
    })
    public void lastWordDoesNotMatch(String inputString, int expectedResult) {
        int words = new CountLetters().count(inputString);
        Assertions.assertEquals(expectedResult, words);
    }

}