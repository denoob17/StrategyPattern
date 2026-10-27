import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void delegatesCalculationToStrategy() {
        Calculator calculator = new Calculator((a, b) -> 42);

        assertEquals(42, calculator.calculate(1, 2));
    }

    @Test
    void passesOperandsToStrategyInCorrectOrder() {

        Calculator calculator = new Calculator((a, b) -> a * 10 + b);

        assertEquals(12, calculator.calculate(1, 2));
    }

    @Test
    void worksWithRealStrategyFromConstructor() {
        Calculator calculator = new Calculator(new AddStrategy());

        assertEquals(15, calculator.calculate(10, 5));
    }

    @Test
    void strategyCanBeSwitchedAtRuntime() {
        Calculator calculator = new Calculator(new AddStrategy());
        assertEquals(15, calculator.calculate(10, 5));

        calculator.setStrategy(new SubtractStrategy());
        assertEquals(5, calculator.calculate(10, 5));

        calculator.setStrategy(new MultiplyStrategy());
        assertEquals(50, calculator.calculate(10, 5));
    }

    @Test
    void newStrategyCanBeAddedWithoutChangingCalculator() {

        Calculator calculator = new Calculator((a, b) -> Math.max(a, b));

        assertEquals(10, calculator.calculate(10, 5));
    }
}