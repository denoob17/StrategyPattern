import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddStrategyTest {

    private final Strategy strategy = new AddStrategy();

    @Test
    void addsTwoPositiveNumbers() {
        assertEquals(15, strategy.execute(10, 5));
    }

    @Test
    void addsNegativeNumber() {
        assertEquals(-3, strategy.execute(2, -5));
    }

    @Test
    void addingZeroReturnsSameNumber() {
        assertEquals(7, strategy.execute(7, 0));
    }
}