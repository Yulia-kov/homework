package Test;

import lesson6.Book;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Игра началась");

        Cow cow1 = new Cow("Сow1", 10, 19, 25, 2);
        Cow cow2 = new Cow("Cow2", 12, 18, 25, 2);
        Rabbit rabbit1 = new Rabbit("Rabbit1", 2, 13, 7, 0);
        Chicken chicken1 = new Chicken("Chicken1", 2, 12, 6, 1);
        Chicken chicken2 = new Chicken("Chicken2", 1, 11, 6, 1);
        Cat cat1 = new Cat("Cat1", 3, 30, 15, 0);


        Bear bear = new Bear("Bear", 15, 20, 10, 0);
        Wolf wolf = new Wolf("Wolf", 8, 25, 8, 0);
        Fox fox = new Fox("Fox", 7, 28, 6, 0);


        Farm farm = new Farm("ФЕРМА");
        System.out.println(farm.name);


        farm.addHA(cow1);
        farm.addHA(cow2);
        farm.addHA(rabbit1);
        farm.addHA(chicken1);
        farm.addHA(chicken2);
        farm.addHA(cat1);


        farm.addWA(bear);
        farm.addWA(wolf);
        farm.addWA(fox);


        farm.passDay();


    }

}
