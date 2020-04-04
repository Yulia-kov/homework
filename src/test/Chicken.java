package Test;

public class Chicken extends HomeAnimals implements ToGiveResource, ToBeEatableByFarmer, ToBeEatableByWilds {
    public Chicken(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed, health, resource);
    }

    @Override
    public void beEatableF() {
        System.out.println(name + " съеден фермером ");

    }

    @Override
    public void beGiven() {
        System.out.println(name + " отдала фермеру " + resource + "ед. ресурса ");

    }

}
