public class BmiService {

    public double calculate(double kilogram, double meter) {
       double bmi = kilogram / (meter * meter);
        return (int) bmi;
    }
}
