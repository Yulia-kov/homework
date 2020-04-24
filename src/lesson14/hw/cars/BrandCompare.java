package lesson14.hw.cars;

import java.util.Comparator;

public class BrandCompare implements Comparator<Car> {


    //вот я все делала без сompareTo, похоже я не очень поняла его необходимость, и как правильнее
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getBrand().equals(o2.getBrand())) {
            return 0;
        } else {
            return -1;
        }

    }
}
