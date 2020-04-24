package lesson14.hw.cars;

import java.util.Comparator;

public class PriceCompare implements Comparator<Car> {
    //вот я все делала без сompareTo, похоже я не очень поняла его необходимость, и как правильнее

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        }
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}




