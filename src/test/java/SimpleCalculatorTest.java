import com.example.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleCalculatorTest {

    @Test
    void testAdd() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-4, 3));
    }

    @Test
    void testSubtract() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-7, calculator.subtract(3, 10));
    }

    @Test
    void testMultiply() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(-12, calculator.multiply(4, -3));
    }

    @Test
    void testDivide() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2.0, calculator.divide(10, 5), 0.0001);
        assertEquals(3.3333, calculator.divide(10, 3), 0.0001);
    }

    @Test
    void testDivideByZero() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }
}