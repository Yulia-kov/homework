package fitnessTask;

import java.time.LocalDate;
import java.time.LocalTime;

public class OneTime extends Membership implements GymZone, SwimmingPool, AerobicZone, StartTime, EndTime {
    public OneTime(LocalDate start, LocalDate end, String name, String surname, int year) {
        super(start, end, name, surname, year);
    }


    @Override
    public boolean ableGym() {
        return true;
    }


    @Override
    public boolean ablePool() {
        return true;
    }

    @Override
    public boolean ableAerob() {
        System.out.println("Данный абонемент не дает доступ в групповой зал: " + name);
        return false;
    }

    @Override
    public LocalTime stTime() {
        LocalTime startTime = LocalTime.of(8, 00);
        return startTime;
    }

    @Override
    public LocalTime eTime() {
        LocalTime endTime = LocalTime.of(22, 00);
        return endTime;
    }



}
