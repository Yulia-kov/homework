package lesson14.hw.cars;

import java.util.ArrayList;

public class ComparingExample {
    public static void main(String[] args) {
        Car blackOpel = new Car("black", "opel", 2000);
        Car redOpel = new Car("red", "opel", 2500);
        Car yellowMazda = new Car("yellow", "mazda", 3000);
        Car greenMazda = new Car("green", "mazda", 3000);


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(blackOpel);
        cars.add(redOpel);
        cars.add(yellowMazda);
        cars.add(greenMazda);

        BrandCompare brandCompare = new BrandCompare();
        PriceCompare priceCompare = new PriceCompare();
        ColorCompare colorCompare = new ColorCompare();

        cars.sort(brandCompare);
        System.out.println("Сортировка по бренду:");
        for (Car car : cars) {
            System.out.println(car);
        }

        cars.sort(priceCompare);
        System.out.println("Сортировка по цене:");
        for (Car car : cars) {
            System.out.println(car);
        }

        cars.sort(colorCompare);
        System.out.println("Сортировка по цвету:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}