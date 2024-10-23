package gui_calculator_pckg;

public class AddCalcStrategy implements CalculationStrategy{
    @Override
    public double performCalculation(double fst, double snd) {
        return fst+snd;
    }

    @Override
    public String toString() {
        return "AddCalcStrategy{}";
    }
}
