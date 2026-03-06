
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
            "4,2, 2",
    })
    void check_subtract_numberOne_numberTwo(float numberOne, float numberTwo, float expectedOutput){
        assertEquals(expectedOutput, Calculator.subtrac(numberOne,numberTwo));
    }

    @ParameterizedTest
    @CsvSource({
            "2,3, 6",
            "2,-4, -8",
            "2,0, 0",
    })
    void check_numberOne_multiply_numberTwo(float numberOne, float numberTwo, float expectedOutput){
        assertEquals(expectedOutput, Calculator.multiply(numberOne,numberTwo));
    }
    @ParameterizedTest
    @CsvSource({
            "2,2, 1",
            "4,0, 1",
            "21,5, 4.2"
    })
    void check_numberTwo_divide_numberOne(float numberOne, float numberTwo, float expectedOutput){
        assertEquals(expectedOutput, Calculator.divide(numberOne, numberTwo));
    }
}

