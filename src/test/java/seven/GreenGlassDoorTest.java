package seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.kyu.seven.GreenGlassDoor;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreenGlassDoorTest {
    GreenGlassDoor greenGlassDoor = new GreenGlassDoor();
    @ParameterizedTest
    @MethodSource("testCases")
    public void testGreenGlassDoor(boolean expected, String s) {assertEquals(expected, greenGlassDoor.stepThroughWith(s));}

    static Collection<Arguments> testCases() {
        return Arrays.asList(
                Arguments.of(true, "comment"),
                Arguments.of(true, "commment"),
                Arguments.of(false, "comet")
        );
    }
}
