package gui_calculator_pckg;

import java.io.Serializable;

// Data record class to store calculation input, result, and strategy
public record CalculationFormData(double fst, double snd, double result, CalculationStrategy calStrategy) implements Serializable {

    @Override
    public String toString() {
        return "CalculationFormData{" +
                "fst=" + fst +
                ", snd=" + snd +
                ", result=" + result +
                ", calStrategy=" + calStrategy +
                '}';
    }
}
