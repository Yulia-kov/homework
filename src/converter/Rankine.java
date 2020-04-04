package converter;

public class Rankine extends BaseConverter implements Convert, GetConverted {
    protected double tempR;

    public Rankine(double tempC) {
        super(tempC);
    }


    @Override
    public void convertValue() {
        tempR = 1.8 * tempC + 491.67;
    }

    @Override
    public double getConvertedValue() {
        return tempR;
    }
}
