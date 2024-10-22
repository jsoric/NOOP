package pckg_calculator_task01;

public class CalculatorApp {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // Set strategy to Addition and perform calculation
        calculator.setOperation(new Addition());
        calculator.calculate(10, 5);

        // Set strategy to Subtraction and perform calculation
        calculator.setOperation(new Subtraction());
        calculator.calculate(20, 10);

        // Set strategy to Multiplication and perform calculation
        calculator.setOperation(new Multiplication());
        calculator.calculate(6, 7);

        // Set strategy to Division and perform calculation
        calculator.setOperation(new Division());
        calculator.calculate(40, 8);
    }
}
