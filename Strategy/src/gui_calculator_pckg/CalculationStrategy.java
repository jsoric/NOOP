package gui_calculator_pckg;

import java.io.Serializable;

// Interface for calculation strategies
public interface CalculationStrategy extends Serializable {

    double performCalculation(double fst, double snd); // Perform the specific calculation
}
