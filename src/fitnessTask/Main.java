package fitnessTask;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {


        OneTime oneTime1 = new OneTime(LocalDate.now(), LocalDate.now(), "oneTime1", "Ofirst", 1980);
        OneTime oneTime2 = new OneTime(LocalDate.now(), LocalDate.now(), "oneTime2", "Osecond", 1970);
        OneTime oneTime3 = new OneTime(LocalDate.now(), LocalDate.now(), "oneTime3", "Othird", 1985);

        Daily daily1 = new Daily(LocalDate.of(2019, Month.MARCH, 20),
                LocalDate.of(2020, Month.MARCH, 20), "daily1", "Dfirst", 1990);
        Daily daily2 = new Daily(LocalDate.of(2017, Month.SEPTEMBER, 10),
                LocalDate.of(2020, Month.SEPTEMBER, 10), "daily2", "Dsecond", 1995);
        Daily daily3 = new Daily(LocalDate.of(2019, Month.MARCH, 20),
                LocalDate.of(2021, Month.MARCH, 20), "daily3", "Dthird", 2001);

        Full full1 = new Full(LocalDate.of(2020, Month.JANUARY, 10),
                LocalDate.of(2020, Month.JUNE, 10), "full1", "Ffirst", 1960);
        Full full2 = new Full(LocalDate.of(2020, Month.FEBRUARY, 2),
                LocalDate.of(2021, Month.FEBRUARY, 2), "full2", "Fsecond", 1973);
        Full full3 = new Full(LocalDate.of(2020, Month.JANUARY, 11),
                LocalDate.of(2021, Month.JANUARY, 11), "full3", "Fthird", 1988);

        Fitness fitness = new Fitness();


        fitness.addM(oneTime1);
        fitness.addM(oneTime2);
        fitness.addM(oneTime3);
        fitness.addM(daily1);
        fitness.addM(daily2);
        fitness.addM(daily3);
        fitness.addM(full1);
        fitness.addM(full2);
        fitness.addM(full3);

        fitness.Day();

        fitness.Inf();

        fitness.MemInf();


    }
}

