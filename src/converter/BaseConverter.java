package converter;

public class BaseConverter implements GetConverted, Convert {
    protected double tempC;


    public BaseConverter(double tempC) {
        this.tempC = tempC;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    @Override
    public void convertValue() {

    }

    @Override
    public double getConvertedValue() {
        return 0;
    }


    public static BaseConverter convert(String type) {
        BaseConverter scale = null;
        if ("Del".equals(type)) {
            scale = new Delisle(10);
            scale.convertValue();
            System.out.println("Изначальная температура по Цельсию " + scale.tempC + " равна " + scale.getConvertedValue() + " по Делилю");
        } else if ("Fr".equals(type)) {
            scale = new Fahrenheit(15);
            scale.convertValue();
            System.out.println("Изначальная температура по Цельсию " + scale.tempC + " равна " + scale.getConvertedValue() + " по Фаренгейту");
        } else if ("Kl".equals(type)) {
            scale = new Kelvin(20);
            scale.convertValue();
            System.out.println("Изначальная температура по Цельсию " + scale.tempC + " равна " + scale.getConvertedValue() + " по Кельвину");
        } else if ("Ran".equals(type)) {
            scale = new Rankine(30);
            scale.convertValue();
            System.out.println("Изначальная температура по Цельсию " + scale.tempC + " равна " + scale.getConvertedValue() + " по Ранкину");
        } else {
            System.out.println("Неправильная шкала конвертации");
        }
        return scale;
    }


}
