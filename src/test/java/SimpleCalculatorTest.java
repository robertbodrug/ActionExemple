import com.example.SimpleCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleCalculatorTest {
    private SimpleCalculator calculator;
    @BeforeEach
    public void beforeEach() {
        calculator = new SimpleCalculator();
    }
    @Test
    void testAdd() {

        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-4, 3));

    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-7, calculator.subtract(3, 10));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(-12, calculator.multiply(4, -3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5), 0.0001);
        assertEquals(3.3333, calculator.divide(10, 3), 0.0001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
}