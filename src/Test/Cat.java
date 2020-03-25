package Test;

public class Cat extends HomeAnimals implements ToBeEatableByWilds, ToRunAway {

    public Cat(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed, health, resource);
    }

    @Override
    public void toBeEatableW() {

    }

    @Override
    public void toRun() {

    }
}
