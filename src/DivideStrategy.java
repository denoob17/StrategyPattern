public class DivideStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}