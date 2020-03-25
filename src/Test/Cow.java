package Test;

public class Cow extends HomeAnimals implements ToGiveResource, ToBeEatableByFarmer, ToBeEatableByWilds, ToRunAway {
    public Cow(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed, health, resource);
    }

    @Override
    public void beEatableF() {
        System.out.println("съеден ");
    }

    @Override
    public void toBeEatableW() {
        System.out.println("съеден");


    }

    @Override
    public void toRun() {

    }
}
