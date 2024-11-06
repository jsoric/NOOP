package gui_calculator_pckg;

import java.io.Serializable;

public class AddCalcStrategy implements CalculationStrategy {
    @Override
    public double performCalculation(double fst, double snd) {
        return fst + snd; // Perform addition operation between two numbers
    }

    @Override
    public String toString() {
        return "AddCalcStrategy{}";
    }
}
