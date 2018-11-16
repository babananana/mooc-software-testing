package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher cipher;

    @BeforeEach
    public void initialize() {
        this.cipher = new CaesarShiftCipher();
    }

    @ParameterizedTest(name = "message={0}, shift={1}, expectedResult={2}")
    @CsvSource({
            "abcdef0,5,invalid",
            ",5,invalid",
            "A$bcd,1,invalid"
    })
    public void invalidMessageTest(String message, int shift, String expectedResult) {
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, expectedResult={2}")
    @CsvSource({
            "abcdef,5,fghijk",
            "abcdef,-21,fghijk",
            "abcdef,31,fghijk",
    })
    public void shiftLevelTest(String message, int shift, String expectedResult) {
        String result = cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
