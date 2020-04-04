package Test;

public class WildAnimals extends AnimalsNames implements ToRunAway {
    protected int power;
    protected int numKick;

    public WildAnimals(String name, int weight, int speed, int power, int NumKick) {
        super(name, weight, speed);
        setPower(power);
        setNumKick(numKick);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumKick() {
        return numKick;
    }

    public void setNumKick(int numKick) {
        this.numKick = 0;
    }

    @Override
    public void toRun() {
        System.out.println("Фермер прогнал " + name);
        numKick +=1;
        System.out.println(name + " прогнан с фермы: " + numKick + " раз");
    }
}
