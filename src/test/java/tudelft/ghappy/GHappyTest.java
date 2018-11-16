package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class GHappyTest {

    // Partitions:
    //   1. none, one or multiple sets of g's
    //   2. single g or three-g's; should be ignored
    //   3. empty string (exceptional, asserts)

    @ParameterizedTest(name = "input={0}, expectedResult={1}")
    @CsvSource  ({
                    "xxggxx,true",
                    "xxgxx,false",
                    "xxggyygxx,false",
                    // this one asserts: ",false",
                    "xxgggyyggxx,true",
                    "g,false",
                    "gg,true"
                 })
    public void firstTest(String inputString, boolean expectedResult) {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy(inputString);
        Assertions.assertEquals(expectedResult, result);
    }
}
