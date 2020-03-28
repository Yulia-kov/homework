package Test;

import java.util.Random;

public class Rabbit extends HomeAnimals implements ToBeEatableByFarmer, ToBeEatableByWilds {
    public Rabbit(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed, health, resource);
    }




    @Override
    public void beEatableF() {
        System.out.println(name + " съеден фермером ");

    }

}
