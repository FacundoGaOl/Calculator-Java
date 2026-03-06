
import org.example.Calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
    @ParameterizedTest
    @CsvSource  ({
            "1,2, 3",
            "4,5, 9"
    })
    void check_sum_numberOne_plus_numberTwo(float numberOne, float numberTwo, float expectedOutput){
        assertEquals(expectedOutput, Calculator.sum(numberOne, numberTwo));
        assertNotEquals(4,Calculator.sum(numberOne, numberTwo));
    }
    @ParameterizedTest
    @CsvSource ({
            "1,2, -1",
            "4,5, -1",
    })
    void check_substract_numberOne_numberTwo(float numberOne, float numberTwo, float expectedOutput){
        assertEquals(expectedOutput, Calculator.substrac(numberOne,numberTwo));
    }
}

