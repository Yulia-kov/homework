package Test;

import java.util.Random;

public class Farmer implements ToGetResource, ToEatAnimalFarmer, ToKickOut {
    protected int farmerResource;

    public Farmer(int farmerResource) {
        this.farmerResource = farmerResource;
    }

    public int getFarmerResource() {
        return farmerResource;
    }

    public void setFarmerResource(int farmerResource)
    {
        this.farmerResource = 5;
    }




    @Override
    public void toGetRes(ToGiveResource enemy) {
        enemy.beGiven();

    }

    @Override
    public void toEatF(ToBeEatableByFarmer enemy) {
        enemy.beEatableF();
    }

    @Override
    public void toKick(ToRunAway enemy) {
enemy.toRun();
    }
}
