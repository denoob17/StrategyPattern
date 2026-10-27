import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractStrategyTest {

    private final Strategy strategy = new SubtractStrategy();

    @Test
    void subtractsSecondFromFirst() {
        assertEquals(5, strategy.execute(10, 5));
    }

    @Test
    void resultCanBeNegative() {
        assertEquals(-5, strategy.execute(5, 10));
    }

    @Test
    void subtractingZeroReturnsSameNumber() {
        assertEquals(7, strategy.execute(7, 0));
    }
}