package converter;

public class Fahrenheit extends BaseConverter implements Convert, GetConverted {
    protected double tempF;

    public Fahrenheit(double tempC) {
        super(tempC);
    }

    @Override
    public void convertValue() {
        tempF = 1.8 * tempC + 32;

    }

    @Override
    public double getConvertedValue() {
        return tempF;
    }
}
