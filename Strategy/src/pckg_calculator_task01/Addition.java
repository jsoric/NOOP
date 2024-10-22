package pckg_calculator_task01;
public class Addition implements MathOperation {

    @Override
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}
