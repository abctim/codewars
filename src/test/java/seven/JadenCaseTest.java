package seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.kyu.seven.JadenCase;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class JadenCaseTest {
    JadenCase jadenCase = new JadenCase();
    @ParameterizedTest
    @MethodSource("testCases")
    public void testJadenCase(String expected, String phrase) {
        assertEquals(expected, jadenCase.toJadenCase(phrase));
    }

    static Collection<Arguments> testCases() {
        return Arrays.asList(
                Arguments.of(null, null),
                Arguments.of(null, ""),
                Arguments.of(null, " "),
                Arguments.of(null, "        "),
                Arguments.of("This Is Correct", "this is correct"),
                Arguments.of("This Is Correct", "This Is Correct"),
                Arguments.of("This Is Correct", "ThiS IS CorReCt"),
                Arguments.of("This Is Correct", "THIS IS CORRECT")
        );
    }
}
