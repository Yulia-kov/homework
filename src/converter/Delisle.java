package converter;

public class Delisle extends BaseConverter implements Convert, GetConverted {
    protected double tempD;

    public Delisle(double tempC) {
        super(tempC);
    }


    @Override
    public void convertValue( ) {
        tempD = 1.5 * tempC - 100;
    }


    @Override
    public double getConvertedValue() {
        return tempD;
    }

}
