package gui_calculator_pckg;

public class SubstractCalcStrategy implements CalculationStrategy {
    @Override
    public double performCalculation(double fst, double snd) {
        return fst - snd; // Perform subtraction operation
    }

    @Override
    public String toString() {
        return "SubstractCalcStrategy{}";
    }
}
