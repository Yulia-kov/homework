package Test;

public class Rabbit extends HomeAnimals implements ToBeEatableByFarmer, ToBeEatableByWilds, ToRunAway {
    public Rabbit(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed, health, resource);
    }

    @Override
    public void beEatableF() {

    }

    @Override
    public void toBeEatableW() {

    }

    @Override
    public void toRun() {

    }
}
