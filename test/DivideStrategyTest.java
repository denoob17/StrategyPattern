import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivideStrategyTest {

    private final Strategy strategy = new DivideStrategy();

    @Test
    void dividesTwoNumbers() {
        assertEquals(2, strategy.execute(10, 5));
    }

    @Test
    void integerDivisionDropsRemainder() {
        assertEquals(3, strategy.execute(7, 2));
    }

    @Test
    void divisionByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> strategy.execute(10, 0));
    }
}