package Test;


import java.util.Date;
import java.util.Random;

public class Farm {

    protected String name;

    public Farm(String name) {
        this.name = name;
    }

    HomeAnimals[] homeAnimals = new HomeAnimals[10];

    public void addHA(HomeAnimals animals) {
        for (int i = 0; i < homeAnimals.length; i++) {
            if (homeAnimals[i] == null) {
                homeAnimals[i] = animals;
                break;
            }
        }

    }

    WildAnimals[] wildAnimals = new WildAnimals[3];

    public void addWA(WildAnimals animals) {
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) {
                wildAnimals[i] = animals;
                break;
            }
        }

    }


    Farmer farmer = new Farmer(5);
    int day = 1;
    int nGivR = 0;
    int nWA = 0;


    public void passDay() {


        final int[] firstHealth = new int[10];

        for (int i = 0; i < homeAnimals.length; i++) {

            if (homeAnimals[i] != null) {
                firstHealth[i] = homeAnimals[i].health;
            }
        }

        while (farmer.farmerResource > 0) {
            System.out.println("ДЕНЬ " + day);

            //11. Фермер тратит 2 единицы ресурсов (если ресурсов не осталось, игра заканчивается).
            farmer.farmerResource = farmer.farmerResource - 2;
            System.out.println("Ресурсы фермера = " + farmer.farmerResource);
            if (farmer.farmerResource <= 0) {
                System.out.println("Игра окончена. Фермер мертв");
                System.exit(0);
            }

//	2. Приходит дикое животное (выбирается рандомно из массива с дикими животными),
//	пытается поймать (съесть, либо ранить) домашнее животное (выбирается рандомно).
//	Если домашнее животное убежало, дикое уходит ни с чем.
            //сначала проверять на скорость потом на силу
            Random random1 = new Random(new Date().getTime());

            int a = random1.nextInt(2) + 1;
            int b = random1.nextInt(5) + 1;
//            while (wildAnimals[a] == null) {
//                a = random1.nextInt(2) + 1; // зацикливается, поэтому делаю через цикл
            //  }
            if (wildAnimals[a] == null) {
                for (int i = 0; i < wildAnimals.length; i++) {
                    if (wildAnimals[i] != null)
                        a = i;
                }
            }

//            while (homeAnimals[b] == null) {
//                b = random1.nextInt(5) + 1;
//            }
            if (homeAnimals[b] == null) {
                for (int i = 0; i < homeAnimals.length; i++) {
                    if (homeAnimals[i] != null)
                        b = i;
                }
            }

            System.out.println(wildAnimals[a].name + " прибежал на ферму");
            if (homeAnimals[b] != null) {
                System.out.println("Сегодняшняя жертва: " + homeAnimals[b].name);
            } else {
                System.out.println("Все домашние животные мертвы");
            }
//	3. Иногда (рандомно) фермер может прогнать дикое животное.
            Random random = new Random();
            if (random.nextBoolean() == true) {
                farmer.toKick(wildAnimals[a]);
                if (wildAnimals[a].numKick == 3) {
                    System.out.println(wildAnimals[a].name + " убежал навсегда");
                    wildAnimals[a] = null;
                }
            } else {


                if (wildAnimals[a].numKick != 4) {

                    if (homeAnimals[b] != null) {
                        if (wildAnimals[a].speed > homeAnimals[b].speed) {

                            if (wildAnimals[a].power > 7) {
                                System.out.println(wildAnimals[a].name + " съел " + homeAnimals[b].name);
                                homeAnimals[b] = null;
                            } else {
                                homeAnimals[b].health -= 10;
                                System.out.println(wildAnimals[a].name + " ранил " + homeAnimals[b].name);
                                System.out.println(homeAnimals[b].name + " health: " + homeAnimals[b].health);
                                if (homeAnimals[b].health <= 0) {
                                    System.out.println(homeAnimals[b].name + " умер, здоровье кончилось");
                                    homeAnimals[b] = null;
                                }
                            }

                        } else {
                            System.out.println(homeAnimals[b].name + " убежал");
                            homeAnimals[b].health -= 5; //устал убегать (
                            System.out.println(homeAnimals[b].name + " health (после того, как убежал): " + homeAnimals[b].health);
                            if (homeAnimals[b].health <= 0) {
                                System.out.println(homeAnimals[b].name + " умер, здоровье кончилось");
                                homeAnimals[b] = null;
                            }
                        }

                    } else {
                        System.out.println("Фермер не может прогнать " + wildAnimals[a].name + " и " + wildAnimals[a].name + " пытается поймать фермера");
                        farmer.farmerResource -= 5;
                        System.out.println("Ресурсы фермера после схватки с " + wildAnimals[a].name + ": " + farmer.farmerResource);

                        if (farmer.farmerResource <= 0 ) {
                            System.out.println("Фермер умер в бою. Игра окончена");
                            System.exit(0);
                        }
                    }
                }

            }


            //	4. Фермер кормит всех животных (животные восполняют здоровье) у животных метод есть но здоровье не мб больше изначального
            //у фермера метод кормить, который по очереди выбирает всех животныъ
            for (int i = 0; i < homeAnimals.length; i++) {
                if (homeAnimals[i] != null) {
                    if (homeAnimals[i].health < firstHealth[i])
                        homeAnimals[i].toEat();
                }
            }

            //	5. Фермер собирает ресурсы с животных, с которых можно их собирать. Если таких не осталось, съедает животное, пригодное в пищу (если такие остались).


            for (int i = 0; i < homeAnimals.length; i++) {
                if (homeAnimals[i] != null) {
                    if (homeAnimals[i] instanceof ToGiveResource) {
                        farmer.toGetRes((ToGiveResource) homeAnimals[i]);
                        farmer.farmerResource += homeAnimals[i].resource;
                        nGivR += 1;
                        //System.out.println("Ресурсы фермера: " + farmer.farmerResource);

                    }


                    if (nGivR == 0 || (farmer.farmerResource + homeAnimals[i].resource <= 0)) {

                        if (homeAnimals[i] instanceof ToBeEatableByFarmer) {
                            farmer.toEatF((ToBeEatableByFarmer) homeAnimals[i]);
                            farmer.farmerResource += homeAnimals[i].weight;
                            System.out.println("Ресурсы фермера: " + farmer.farmerResource);
                            break;
                        }
                    }

                }
            }
            for (int i = 0; i < wildAnimals.length; i++) {
                if (wildAnimals[i] == null) {
                    nWA += 1;
                }
            }
            if (nWA == wildAnimals.length) {
                System.out.println("Игра окончена. Дикие животные проиграли");
                System.exit(0);
            }
            nGivR = 0;
            day += 1;
            nWA = 0;
        }

    }


}
