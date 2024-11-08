package gui_calculator_pckg;

public class MultiplyCalcStrategy implements CalculationStrategy {
    @Override
    public double performCalculation(double fst, double snd) {
        return fst * snd; // Perform multiplication operation
    }

    @Override
    public String toString() {
        return "MultiplyCalcStrategy{}";
    }
}
