package Test;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;

public class HomeAnimals extends AnimalsNames {
    protected int health;
    protected int resource;

    public HomeAnimals(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed);
        setHealth(health);
        setResource(resource);

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }


    public void toEat() {
            health += 1;
        System.out.println(name + " health (после кормления): " +  health);

    }
}
