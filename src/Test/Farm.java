package Test;

import java.util.Random;

public class Farm {

    HomeAnimals[] homeAnimals = new HomeAnimals[10];
    public void addHA(HomeAnimals animals) {
        for (int i = 0; i <homeAnimals.length ; i++) {
            if ( homeAnimals [i] != null) {
                homeAnimals[i] = animals;
            }
        }

    }

    WildAnimals[] wildAnimals = new WildAnimals[3];
    public void addWA(WildAnimals animals) {
        for (int i = 0; i <wildAnimals.length ; i++) {
            if ( wildAnimals [i] != null) {
                wildAnimals[i] = animals;
            }
        }

    }



    Farmer farmer = new Farmer();


int a = (int)Math.random()*3+1;


    public void passDay() {
        farmer.farmerResource = farmer.farmerResource - 2;
wildAnimals[a].toEatAnimalswilds;


        for (int i = 0; i <homeAnimals.length ; i++) {
            if(homeAnimals[i] != null ){
                if(homeAnimals[i].resource != 0 ) {
                    farmer.toGetRes();
                } else {
                    farmer.toEatF(homeAnimals[i]);
                }

            }
        }




    }


}
