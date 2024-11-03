package gui_calculator_pckg;

import java.io.Serializable;

public interface CalculationStrategy extends Serializable {

    double performCalculation(double fst, double snd);
}
