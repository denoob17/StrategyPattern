import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyStrategyTest {

    private final Strategy strategy = new MultiplyStrategy();

    @Test
    void multipliesTwoNumbers() {
        assertEquals(50, strategy.execute(10, 5));
    }

    @Test
    void multiplyingByZeroGivesZero() {
        assertEquals(0, strategy.execute(10, 0));
    }

    @Test
    void multiplyingNegativeNumbers() {
        assertEquals(6, strategy.execute(-2, -3));
    }
}