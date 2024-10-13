package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testResult(){
        int sum = calculator.result("1 * 5");
        assertThat(sum).isEqualTo(5);
    }
}
