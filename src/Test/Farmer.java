package Test;

import java.util.Random;

public class Farmer implements ToGetResource, ToEatAnimalFarmer, ToKickOut, ToFeedAnimal {
    protected int farmerResource;

    public int getFarmerResource() {
        return farmerResource;
    }

    public void setFarmerResource(int farmerResource)
    {
        this.farmerResource = 5;
    }

    @Override
    public void toEatF(ToBeEatableByFarmer enemy) {
farmerResource = farmerResource + ;

    }


    @Override
    public void Feed() {
        for (int i = 0; i < ; i++) {

        }
    }

    @Override
    public void toGetRes() {

    }

    @Override
    public void toKick(WildAnimals enemy) {
        Random random = new Random();
        random.nextBoolean();
        if ( random == true) {
            enemy.numKick +=1;
            if (enemy.numKick = 3) {

            }
        }

    }
}
