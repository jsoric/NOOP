package gui_calculator_pckg;
// record je data class
public record CalculationFormData(double fst, double snd, double result, CalculationStrategy calStrategy) {

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
