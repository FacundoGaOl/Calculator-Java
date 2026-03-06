
import org.example.Calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @ParameterizedTest
    @CsvSource  ({
            "3, 3",
    })
    void check_sum_numberOne_plus_numberTwo(int numberOne, int numberTwo, int expectedOutput){
        assertEquals(expectedOutput, new Calculator().sum(int numberOne + int numberTwo));
    }
}

