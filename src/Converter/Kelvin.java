package Converter;

public class Kelvin extends BaseConverter implements Convert, GetConverted {
    protected double tempK;

    public Kelvin(double tempC) {
        super(tempC);
    }

    @Override
    public void convertValue() {
        tempK = tempC + 273.15;
    }

    @Override
    public double getConvertedValue() {
        return tempK;
    }
}
