package Test;

public class Chicken extends HomeAnimals implements ToGiveResource, ToBeEatableByFarmer, ToBeEatableByWilds, ToRunAway {
    public Chicken(String name, int weight, int speed, int health, int resource) {
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
