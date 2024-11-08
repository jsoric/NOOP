package pckg_calculator_task01;

public class Calculator {

    private MathOperation operation;

    // Set the operation (strategy) dynamically
    public void setOperation(MathOperation operation) {
        this.operation = operation;
    }

    // Perform calculation based on the current strategy
    public void calculate(int num1, int num2) {
        System.out.println("Result: " + operation.execute(num1, num2));
    }
}
