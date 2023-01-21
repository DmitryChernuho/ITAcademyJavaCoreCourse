import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StringUtilTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/tests_data/concatTwoValues.csv", numLinesToSkip = 1)
    private void concatTwoValuesTest(ArgumentsAccessor argumentsAccessor) {
//        argumentsAccessor.
//        String actualResult = StringUtil.concatTwoValues(firstValue, secondValue);
//        Assertions.assertEquals(expectedResult, actualResult);
    }
}
