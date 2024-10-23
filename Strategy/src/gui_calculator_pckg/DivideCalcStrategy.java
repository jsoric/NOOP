package gui_calculator_pckg;

public class DivideCalcStrategy implements CalculationStrategy {
    @Override
    public double performCalculation(double fst, double snd) {
        if (snd == 0) {
            System.out.println("Division with zero is not allowed!!!");
            throw new ArithmeticException("Zero division!");
        } else {
            return fst / snd;
        }
    }

    @Override
    public String toString() {
        return "DivideCalcStrategy{}";
    }
}