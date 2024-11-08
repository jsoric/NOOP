package pckg_calculator_task01;

public class Division implements MathOperation {

    @Override
    public int execute(int num1, int num2) {
        // Check if division by zero
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}
